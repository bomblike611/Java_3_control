package ifelse_Test;

import java.util.Scanner;

public class IfelseTest_3 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("번호를 입력하세요 :");
		int select=sc.nextInt();
		
		//1.햄버거 2.짜장면 3.샌드위치 4.제육 5.굶기
		
		if(select==1) {
			System.out.println("햄버거 선택");
		}else if(select ==2) {
			System.out.println("짜장면 선택");
		}else if(select ==3) {
			System.out.println("샌드위치 선택");
		}else if(select ==4) {
			System.out.println("제육 선택");
		}else {
			System.out.println("굶기");
		}
	}

}
