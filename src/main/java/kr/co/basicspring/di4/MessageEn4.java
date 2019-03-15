package kr.co.basicspring.di4;

import javax.swing.JOptionPane;
import kr.co.basicspring.di3.IHello;

public class MessageEn4 implements IHello {
	
	public MessageEn4() {
		System.out.println("Create MessageEn4() Object");
	}

	@Override
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "Hello "+name);
	}
	
}
