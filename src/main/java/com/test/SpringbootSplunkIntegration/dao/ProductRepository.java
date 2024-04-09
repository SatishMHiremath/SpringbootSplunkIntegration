package com.test.SpringbootSplunkIntegration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.SpringbootSplunkIntegration.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
