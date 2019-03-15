package kr.co.basicspring.di2;

import javax.swing.JOptionPane;

public class MessageEn2 {
	
	public MessageEn2() {
		System.out.println("Create MessageEn2() Object");
	}
	
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "Hello "+name);
	}
	
}
