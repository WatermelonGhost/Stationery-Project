package com.example.java;

import lombok.Data;

@Data
public class OrderDeliveryDTO {
	String m_id, o_date, o_no, o_img, o_info, o_ps, o_name, o_address, o_phone, o_dm;
	int o_count, o_price, r_, o_df;
}