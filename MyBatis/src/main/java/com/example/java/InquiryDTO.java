package com.example.java;

import lombok.Data;

@Data
public class InquiryDTO {
	int inquiry_no, inquiry_readcount;
	
	String inquiry_title, inquiry_content, inquiry_writer, 
	inquiry_created, inquiry_password, inquiry_secure, inquiry_updated, inquiry_product;
	
	String response_title, response_content, response_writer, 
	response_created, response_updated, response_readcount;
	
	String prod_img, prod_code, prod_name, prod_company;
	int prod_price;
}