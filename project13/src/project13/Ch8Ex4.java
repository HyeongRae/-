package project13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ch8Ex4 extends JFrame {
	JButton button1 = new JButton("버튼1");
	JButton button2 = new JButton("버튼2");
	JButton button3 = new JButton("버튼3");
	JButton button4 = new JButton("버튼4");
	JButton button5 = new JButton("버튼5");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	public void flowLayout() {
		p1.setLayout(new FlowLayout());
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
	}
	
	public void gridLayout() {
		p1.setLayout(new GridLayout(2, 2));
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
	}
	public void borderLayout() {
		p1.setLayout(new BorderLayout());
		p1.add(button1, BorderLayout.NORTH);
		p1.add(button2, BorderLayout.WEST);
		p1.add(button3, BorderLayout.EAST);
		p1.add(button4, BorderLayout.SOUTH);
		p1.add(button5, BorderLayout.CENTER);
	}
	public void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p2.add(button4);
		p2.add(button5);
		add("p1", p1);
		add("p2", p2);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(getContentPane(),  "p2");
			}
		});
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(getContentPane(),  "p1");
			}
		});
	}
	
	public Ch8Ex4() {
		super("Layout Showcase");
		getContentPane().add(p1);
		//flowLayout();
		//gridLayout();
		//borderLayout();
		cardLayout();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch8Ex4 app = new Ch8Ex4();
	}

}
