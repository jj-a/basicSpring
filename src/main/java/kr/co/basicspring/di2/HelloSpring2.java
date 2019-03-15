package kr.co.basicspring.di2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring2 {
	
	public HelloSpring2() {
		;
	}
	
	public static void main(String[] args) {
		
		// Spring Bean
		
		Resource resource = new ClassPathResource("spring.xml");
		
		
		// Factory Bean
		XmlBeanFactory factory = new XmlBeanFactory(resource);	// 현재 지원중단된 메소드
		
		
		// Object 가져오기
		
		Object obj = factory.getBean("msgKo");
		MessageKo2 korea = (MessageKo2) obj;
		korea.sayHello("배불라");
		
		obj = factory.getBean("msgEn");
		MessageEn2 english = (MessageEn2) obj;
		english.sayHello("not John Doe");
		
		
		
	}
	
}
