package project12;

import java.util.StringTokenizer;

public class Ch6Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "홍길동, 010-123-1234, 서울시 종로구, 학생";
		StringTokenizer st = new StringTokenizer(data, ",");
		
		System.out.println("## 개인 정보 출력 ##");
		System.out.println("이름: " + st.nextToken());
		System.out.println("전화번호:" + st.nextToken());
		System.out.println("주소:" + st.nextToken());
		System.out.println("직업:" + st.nextToken());
	}

}
