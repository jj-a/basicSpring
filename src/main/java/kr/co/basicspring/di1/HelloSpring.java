package kr.co.basicspring.di1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring {
	
	public HelloSpring() {
		;
	}
	
	public static void main(String[] args) {
		
		// Spring Bean
		
		Resource resource = new ClassPathResource("spring.xml");
		
		
		// Factory Bean
		XmlBeanFactory factory = new XmlBeanFactory(resource);	// 현재 지원중단된 메소드
		
		
		// Object 가져오기
		
		Object obj = factory.getBean("msgKo");
		MessageKo korea = (MessageKo) obj;
		korea.sayHello("배고픔");
		
		obj = factory.getBean("msgEn");
		MessageEn english = (MessageEn) obj;
		english.sayHello("not John Doe");
		
		
		
	}
	
}
