package com.zeluli.di.annotation;

import org.springframework.stereotype.Repository;

@Repository		//在DAO层（数据访问层）使用的Bean
public class RepositoryBean {
	public String description() {
		return "@Repository----我是在DAO层（数据访问层）使用的Bean";
	}
}
