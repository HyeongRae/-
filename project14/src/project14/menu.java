package project14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class menu extends JFrame {
	JMenuBar bar = new JMenuBar();
	JMenu F = new JMenu("파일");
	JMenuItem F1 = new JMenuItem("새로만들기");
	JMenuItem F2 = new JMenuItem("열기");
	JMenuItem F3 = new JMenuItem("저장");
	JMenuItem F4 = new JMenuItem("다른 이름으로 저장");
	JMenuItem F5 = new JMenuItem("페이지 설정");
	JMenuItem F6 = new JMenuItem("인쇄");
	JMenuItem F7 = new JMenuItem("끝내기");
	
	JMenu E = new JMenu("편집");
	JMenuItem E1 = new JMenuItem("실행취소");
	JMenuItem E2 = new JMenuItem("잘라내기");
	JMenuItem E3 = new JMenuItem("복사");
	JMenuItem E4 = new JMenuItem("붙여넣기");
	JMenuItem E5 = new JMenuItem("삭제");
	JMenuItem E6 = new JMenuItem("찾기");
	JMenuItem E7 = new JMenuItem("다음 찾기");
	JMenuItem E8 = new JMenuItem("바꾸기");
	JMenuItem E9 = new JMenuItem("이동");
	JMenuItem E10 = new JMenuItem("모두 선택");
	JMenuItem E11 = new JMenuItem("시간/날자");
	
	JMenu O = new JMenu("서식");
	JMenuItem O1 = new JMenuItem("자동 줄 바꿈");
	JMenuItem O2 = new JMenuItem("글꼴");
	
	JMenu V = new JMenu("보기");
	JMenuItem V1 = new JMenuItem("상태 표시줄");
	
	JMenu H = new JMenu("도움말");
	JMenuItem H1 = new JMenuItem("도움말 보기");
	JMenuItem H2 = new JMenuItem("메모장 정보");
	
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
