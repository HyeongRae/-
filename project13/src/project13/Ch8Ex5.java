package project13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ch8Ex5 extends JFrame implements ActionListener {
	int index = 0;
	String[] msgs = {"ù ��° ����", "�� ��° ����", "�� ��° ����"};
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton(msgs[0]);
	
	public Ch8Ex5() {
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.setEnabled(false);
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == button1) {
			index--;
		}
		else if(obj == button2) {
			index++;
		}
		if(index > 2)
			index = 0;
		else if(index < 0)
			index = 2;
		button3.setText(msgs[index]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch8Ex5 app = new Ch8Ex5();
	}

}