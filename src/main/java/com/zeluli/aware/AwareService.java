package com.zeluli.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	private ResourceLoader loader;
	
	@Value("classpath:com/zeluli/el/test.txt")
	private String testFile;
	

	public AwareService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setResourceLoader(ResourceLoader loader) {
		this.loader = loader;
	}

	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void outputResult() {
		System.out.println("Bean的名称为：" + beanName);
		Resource resource = loader.getResource(this.testFile);
		try {
			System.out.println("ResourceLoader加载的文件内容为" + IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
