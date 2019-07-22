package com.thomsontech.core.productsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thomsontech.core.productsapi.bo.ProductsBO;
import com.thomsontech.core.productsapi.dto.ProductDTO;
import com.thomsontech.core.productsapi.exception.ApiRequestException;
import com.thomsontech.core.productsapi.vo.ProductsOutputVO;

@RestController
@RequestMapping("/api")
public class ProductsController {
	@Autowired
	ProductsBO productBo;
	
	@GetMapping("/products")
	public ResponseEntity<ProductsOutputVO> getProducts() {
		return null;
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> getProduct(
			@RequestHeader("application-id") String appid,
			@RequestHeader("session-token") String token,
			@PathVariable("id") String id) {
		
		if(appid.equals("client-01") && token.equals("1234567890")) {
			return ProductsBO.getProduct(id);
		}else {
			throw new ApiRequestException("Invalid header values");			
		}		
	}
	
}
