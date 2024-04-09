package com.test.SpringbootSplunkIntegration.service;

import java.util.List;

import com.test.SpringbootSplunkIntegration.dto.ProductResponse;

public interface ProductService {
	
	public List<ProductResponse> findAllProducts();
	
}
