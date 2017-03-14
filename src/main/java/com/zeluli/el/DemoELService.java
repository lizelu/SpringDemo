package com.zeluli.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoELService {
	@Value("I Love China!")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	

	@Value("#{(anotherValueService.anotherValue)}")
	private String fromAnother;
	
	@Value("classpath:com/zeluli/el/test.txt")
	private Resource testFile;
	
	@Value("http://www.cnblogs.com")
	private Resource testURL;
	

	
	public void outputResource()  {
		try {
			System.out.println(normal);
			System.out.println(osName);

			System.out.println(fromAnother);
			
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testURL.getInputStream()));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
