package com.zeluli.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	//在业务逻辑层使用
public class ServiceBean {
	
	@Autowired
	RepositoryBean repositoryBean;	//注入DAO层的Bean
	
	public String description() {
		System.out.println(repositoryBean.description());
		return "@Service----我是业务逻辑层Service使用的Bean";
	}
}
