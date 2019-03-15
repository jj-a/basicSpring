package kr.co.basicspring.di3;

import javax.swing.JOptionPane;

public class MessageEn3 implements IHello {
	
	public MessageEn3() {
		System.out.println("Create MessageEn3() Object");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
}
