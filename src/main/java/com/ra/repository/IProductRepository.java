package com.ra.repository;

import com.ra.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}
