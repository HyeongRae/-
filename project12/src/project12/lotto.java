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
				System.out.println("x : 프로그램 종료");
				System.out.println("s : 프로그램 재실행");
				String m = scan.next();
				if(m.equals("x")) {
					System.out.println("프로그램 종료");
					System.exit(0);
					}
				else if(m.equals("s")) {
					System.out.println("프로그램 재실행");
					break;
					}
				else
					System.out.println("다시 입력해 주세요");
				}
		}
	}

}
