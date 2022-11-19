package org.sid.billingservice1.repository;

import org.sid.billingservice1.entites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
 public Collection<ProductItem> findByBill(Long id);
}
