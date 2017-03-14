package com.zeluli.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")		//默认就是singleton
public class SingletonService {
}
