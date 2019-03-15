package kr.co.basicspring.di4;

import kr.co.basicspring.di3.IHello;

public class HelloPOJO4 {
	
	public static void main(String[] args) {
		
		// POJO (Plain Old Java Object)

		IHello hello = null;
		
		hello = new MessageKo4();
		hello.sayHello("비와");

		hello = new MessageEn4();
		hello.sayHello("Rainy");		
		
	} 
}
