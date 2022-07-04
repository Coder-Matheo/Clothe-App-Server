package com.ClotheAppSpringServer.ClotheAppServer.repository;

import com.ClotheAppSpringServer.ClotheAppServer.model.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<ProductData, Integer> {
}
