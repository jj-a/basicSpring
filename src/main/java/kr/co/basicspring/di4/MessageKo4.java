package kr.co.basicspring.di4;

import javax.swing.JOptionPane;
import kr.co.basicspring.di3.IHello;

public class MessageKo4 implements IHello {
	
	public MessageKo4() {
		System.out.println("Create MessageKo4() Object");
	}
	
	@Override
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "안녕하세요 "+name+"님");
	}
	
}
