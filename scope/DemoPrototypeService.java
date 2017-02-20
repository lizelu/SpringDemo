package com.zeluli.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DemoPrototypeService {

	public DemoPrototypeService() {
		// TODO Auto-generated constructor stub
	}

}
