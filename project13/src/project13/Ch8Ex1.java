package project13;

import java.awt.*;
public class Ch8Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("hello World");
		f.setLayout(new FlowLayout());
		Label label = new Label("Welcome to AWT");
		f.add(label);
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
