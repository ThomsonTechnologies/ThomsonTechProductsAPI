package com.thomsontech.core.productsapi.dto;

public class ProductDTO {
	private long id;
	private String name;
	private String description;
	private String category;
	private String status;
	
	public ProductDTO(long id, String name, String description, 
			String category, String status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.status = status;
	}

	public ProductDTO() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
