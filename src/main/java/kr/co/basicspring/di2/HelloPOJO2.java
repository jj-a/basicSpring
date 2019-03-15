package kr.co.basicspring.di2;

public class HelloPOJO2 {
	
	public static void main(String[] args) {
		
		// POJO (Plain Old Java Object)
		
		MessageKo2 korea = new MessageKo2();
		korea.sayHello("배고픔");
		
		MessageEn2 english = new MessageEn2();
		english.sayHello("Tom");
		
	} 
}
