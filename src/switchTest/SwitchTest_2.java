package switchTest;

import java.util.Scanner;

public class SwitchTest_2 {
	public static void main(String[] args) {
		//국어,영어,수학 ->평균
		//평균 90이상이면 A
		//평균 80이상이면 B
		//평균 70이상이면 C
		//그외 나머지는 F
		//switch class
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("국어,영어,수학의 점수를 차례대로 입력해주세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mth = sc.nextInt();
		int evg = (kor+eng+mth)/3;
		
		
		switch(evg/10) {
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default :
			System.out.println("F");
			break;
		
		}
		
		
		
		
		
	}
}
