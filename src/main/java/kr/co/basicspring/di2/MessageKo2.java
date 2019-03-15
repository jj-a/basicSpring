package kr.co.basicspring.di2;

import javax.swing.JOptionPane;

public class MessageKo2 {
	
	public MessageKo2() {
		System.out.println("Create MessageKo2() Object");
	}
	
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "안녕하세요 "+name+"님");
	}
	
}
