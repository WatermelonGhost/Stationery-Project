package com.example.java;

import lombok.Data;

@Data
public class ProductDTO {
	String prod_code, prod_name, prod_category, prod_content, prod_img, prod_regdate, prod_company, prod_bigcategory;
	int prod_price, prod_discount, prod_delivery, r_;
}