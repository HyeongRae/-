package project12;

import java.util.StringTokenizer;

public class Ch6Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "ȫ�浿, 010-123-1234, ����� ���α�, �л�";
		StringTokenizer st = new StringTokenizer(data, ",");
		
		System.out.println("## ���� ���� ��� ##");
		System.out.println("�̸�: " + st.nextToken());
		System.out.println("��ȭ��ȣ:" + st.nextToken());
		System.out.println("�ּ�:" + st.nextToken());
		System.out.println("����:" + st.nextToken());
	}

}
