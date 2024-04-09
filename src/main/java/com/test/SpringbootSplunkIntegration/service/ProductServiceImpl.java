package com.test.SpringbootSplunkIntegration.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.SpringbootSplunkIntegration.dao.ProductRepository;
import com.test.SpringbootSplunkIntegration.dto.ProductResponse;
import com.test.SpringbootSplunkIntegration.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

    Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productDao;

    @Override
    public List<ProductResponse> findAllProducts() {
    	logger.info("Fetch all products ");
    	List<Product> productsList = productDao.findAll();
    	logger.debug("Fetch all products {}", productsList);
        return productsList.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private ProductResponse convertToDTO(Product product) {
        ProductResponse productResp = new ProductResponse();
        productResp.setId(product.getId());
        productResp.setName(product.getName());
        productResp.setQuantity(product.getQuantity());
        productResp.setPrice(product.getPrice());
        return productResp;
    }

}

