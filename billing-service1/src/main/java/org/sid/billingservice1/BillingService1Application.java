package org.sid.billingservice1;

import org.sid.billingservice1.entites.Bill;
import org.sid.billingservice1.entites.ProductItem;
import org.sid.billingservice1.fegin.CustomerRestClient;
import org.sid.billingservice1.fegin.ProductItemRestClient;
import org.sid.billingservice1.model.Customer;
import org.sid.billingservice1.model.Product;
import org.sid.billingservice1.repository.BillRepository;
import org.sid.billingservice1.repository.ProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class BillingService1Application {

    public static void main(String[] args) {

        SpringApplication.run(BillingService1Application.class, args);
    }
@Bean
    CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository , CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient){
        return  args -> {

            Customer customer=customerRestClient.getCustomerById(1L);
            Bill bill=billRepository.save(new Bill(null, new Date(), null, customer.getId(), null));
            PagedModel<Product> productPagedModel=productItemRestClient.pageProducts();
            productPagedModel.forEach(p->{
                ProductItem productItem=new ProductItem();
                productItem.setPrice(p.getPrice());

            });
        };
}
}
