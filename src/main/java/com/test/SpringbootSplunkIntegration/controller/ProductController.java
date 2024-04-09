package com.test.SpringbootSplunkIntegration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.SpringbootSplunkIntegration.dto.ProductResponse;
import com.test.SpringbootSplunkIntegration.service.ProductServiceImpl;

@RestController
@RequestMapping("v1/api/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping("/fetchAll")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> productsList = productServiceImpl.findAllProducts();
        return new ResponseEntity<List<ProductResponse>>(productsList, HttpStatus.OK);
    }
}
