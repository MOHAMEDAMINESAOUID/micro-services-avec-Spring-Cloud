package sid.org.customerservice3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sid.org.customerservice3.entites.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {


}
