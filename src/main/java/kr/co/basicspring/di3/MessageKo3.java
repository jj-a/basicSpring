package kr.co.basicspring.di3;

import javax.swing.JOptionPane;

public class MessageKo3 implements IHello {
	
	public MessageKo3() {
		System.out.println("Create MessageKo3() Object");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요 "+name+"님");
	}
	
}
