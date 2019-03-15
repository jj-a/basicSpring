package kr.co.basicspring.di3;

public class HelloPOJO3 {
	
	public static void main(String[] args) {
		
		// POJO (Plain Old Java Object)

		IHello hello = null;
		
		hello = new MessageKo3();
		hello.sayHello("비와");

		hello = new MessageEn3();
		hello.sayHello("Rainy");		
		
	} 
}
