package com.etoak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.etoak.bean.Email;
@Service
public class EmailService {
	//邮件消息对象
	@Autowired
	SimpleMailMessage mailMessage;
	
	//发送邮件消息对象
	@Autowired
	JavaMailSenderImpl mailSender;
	
	//线程池对象
	@Autowired
	ThreadPoolTaskExecutor executor;
	
	public void send(Email email) {
		//1.封装邮件消息
		mailMessage.setTo(email.getReciver()); //收件人
		mailMessage.setSubject(email.getSubject());//邮件主题
		mailMessage.setText(email.getContent()); //邮件内容
		
		//2.使用线程池对象 异步发送邮件
		executor.execute(()->{
			mailSender.send(mailMessage);
			System.out.println("邮件发送成功");
		});
	}
}
