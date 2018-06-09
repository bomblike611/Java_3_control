package whileTest;

import java.util.Scanner;

public class WhileTest_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean check=true;
		int result=15;
		
		while(check) {
			System.out.print("번호를 입력하세요 :");
			int num=sc.nextInt();
			if(num==result) {
				check=!check;
				System.out.println("종료합니다.");
			}
		}
	}
}
