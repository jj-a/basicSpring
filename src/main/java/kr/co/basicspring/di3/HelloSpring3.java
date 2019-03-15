package kr.co.basicspring.di3;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring3 {
	
	public HelloSpring3() {
		;
	}
	
	public static void main(String[] args) {
		
		// Spring Bean
		Resource resource = new ClassPathResource("spring2.xml");
		// Factory Bean
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		
		IHello hello = null;
		
		hello = (IHello)factory.getBean("msgKo");
		hello.sayHello("비와");

		hello = (IHello)factory.getBean("msgEn");
		hello.sayHello("Rainy");		
		
	}
	
}
