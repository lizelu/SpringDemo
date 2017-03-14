package com.zeluli.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AnotherValueService {
	@Value("我是AnotherValueService.anotherValue的值")
	public String anotherValue;
}
