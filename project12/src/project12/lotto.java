package project12;

import java.util.Random;
import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[7];
		while(true) {
			
			for(int i =0 ; i<7; i++)
				num[i] = 0;
			for (int i = 0; i<7; i++) {
				Random r = new Random();
				num[i] = r.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if(num[i] == num[j])
						i--;
				}
			}
			for (int i = 0; i<7; i++) 
				System.out.printf("%d ", num[i]);
			
			System.out.println();
			while(true){
				System.out.println("x : ���α׷� ����");
				System.out.println("s : ���α׷� �����");
				String m = scan.next();
				if(m.equals("x")) {
					System.out.println("���α׷� ����");
					System.exit(0);
					}
				else if(m.equals("s")) {
					System.out.println("���α׷� �����");
					break;
					}
				else
					System.out.println("�ٽ� �Է��� �ּ���");
				}
		}
	}

}
