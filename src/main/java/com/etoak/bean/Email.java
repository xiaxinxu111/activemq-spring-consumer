package com.etoak.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
	//修改邮件实体类注释
	//主题
	private String subject;
	
	//收件人
	private String reciver;
	
	//内容
	private String content;
	
}
