package org.sid.billingservice1.repository;

import org.sid.billingservice1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BillRepository  extends JpaRepository<Product,Long>
{

}
