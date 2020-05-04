package com.etoak.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
	//主题
	private String subject;
	
	//收件人
	private String reciver;
	
	//内容
	private String content;
	
}
