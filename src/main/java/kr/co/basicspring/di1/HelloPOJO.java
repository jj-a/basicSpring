package kr.co.basicspring.di1;

public class HelloPOJO {
	
	public static void main(String[] args) {
		
		// POJO (Plain Old Java Object)
		
		MessageKo korea = new MessageKo();
		korea.sayHello("배고픔");
		
		MessageEn english = new MessageEn();
		english.sayHello("Tom");
		
	}
}
