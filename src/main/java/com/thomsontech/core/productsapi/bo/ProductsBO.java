package com.thomsontech.core.productsapi.bo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.thomsontech.core.productsapi.dto.ProductDTO;
import com.thomsontech.core.productsapi.vo.ProductOutputVO;

@Component
public class ProductsBO {

	public static ResponseEntity<ProductDTO> getProduct(String id) {
		ProductDTO product = new ProductDTO(22098, "Chicago Skyline", "Chicago City wallpaper", "photo", "available");
		return new ResponseEntity<ProductDTO>(product, HttpStatus.OK);
	}
}
