package com.test.SpringbootSplunkIntegration.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.test.SpringbootSplunkIntegration.dto.ProductResponse;
import com.test.SpringbootSplunkIntegration.entity.Product;

@Mapper
public interface ProductMapper {
		
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	@Mapping(target = "id", ignore = true)
	ProductResponse producToDtoResp(Product product);
}
