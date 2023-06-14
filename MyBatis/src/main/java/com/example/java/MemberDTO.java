package com.example.java;

import lombok.Data;

@Data
public class MemberDTO {
	String id, pw, realname, nickname, gender, birth, address, phone, email;
}