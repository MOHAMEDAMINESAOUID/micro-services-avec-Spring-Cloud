package sid.org.customerservice3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sid.org.customerservice3.entites.Customer;
import sid.org.customerservice3.repository.CustomerRepository;

@SpringBootApplication
public class CustomerService3Application {

    public static void main(String[] args) {

        SpringApplication.run(CustomerService3Application.class, args);
    }
    @Bean
    CommandLineRunner start (CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"Mohamed","medamine@gmail.com"));
            customerRepository.save(new Customer(null,"Said","Saouid@gmail.com"));
            customerRepository.save(new Customer(null,"Ali","Ali@gmail.com"));
            customerRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });
        };
    }

}
