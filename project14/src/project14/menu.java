package project14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class menu extends JFrame {
	JMenuBar bar = new JMenuBar();
	JMenu F = new JMenu("����");
	JMenuItem F1 = new JMenuItem("���θ����");
	JMenuItem F2 = new JMenuItem("����");
	JMenuItem F3 = new JMenuItem("����");
	JMenuItem F4 = new JMenuItem("�ٸ� �̸����� ����");
	JMenuItem F5 = new JMenuItem("������ ����");
	JMenuItem F6 = new JMenuItem("�μ�");
	JMenuItem F7 = new JMenuItem("������");
	
	JMenu E = new JMenu("����");
	JMenuItem E1 = new JMenuItem("�������");
	JMenuItem E2 = new JMenuItem("�߶󳻱�");
	JMenuItem E3 = new JMenuItem("����");
	JMenuItem E4 = new JMenuItem("�ٿ��ֱ�");
	JMenuItem E5 = new JMenuItem("����");
	JMenuItem E6 = new JMenuItem("ã��");
	JMenuItem E7 = new JMenuItem("���� ã��");
	JMenuItem E8 = new JMenuItem("�ٲٱ�");
	JMenuItem E9 = new JMenuItem("�̵�");
	JMenuItem E10 = new JMenuItem("��� ����");
	JMenuItem E11 = new JMenuItem("�ð�/����");
	
	JMenu O = new JMenu("����");
	JMenuItem O1 = new JMenuItem("�ڵ� �� �ٲ�");
	JMenuItem O2 = new JMenuItem("�۲�");
	
	JMenu V = new JMenu("����");
	JMenuItem V1 = new JMenuItem("���� ǥ����");
	
	JMenu H = new JMenu("����");
	JMenuItem H1 = new JMenuItem("���� ����");
	JMenuItem H2 = new JMenuItem("�޸��� ����");
	
	public menu() {
		this.setJMenuBar(bar);
		bar.add(F);
		F.add(F1);
		F.add(F2);
		F.add(F3);
		F.add(F4);
		F.addSeparator();
		F.add(F5);
		F.add(F6);
		F.addSeparator();
		F.add(F7);
		
		bar.add(E);
		E.add(E1);
		E.addSeparator();
		E.add(E2);
		E.add(E3);
		E.add(E4);
		E.add(E5);
		E.addSeparator();
		E.add(E6);
		E.add(E7);
		E.add(E8);
		E.add(E9);
		E.addSeparator();
		E.add(E10);
		E.add(E11);
		
		bar.add(O);
		O.add(O1);
		O.add(O2);
		
		bar.add(V);
		V.add(V1);
		
		bar.add(H);
		H.add(H1);
		H.add(H2);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu app = new menu();
	}

}
