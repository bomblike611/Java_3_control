package ifelse_Test;

import java.util.Scanner;

public class IfelseTest_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int dbId=1234;
		int dbPw=5678;
		System.out.print("ID를 입력하세요 :");
		int yId =sc.nextInt();
		System.out.print("PW를 입력하세요 :");
		int yPw =sc.nextInt();
		
		//로그인 성공 -> 로그인 성공
		//로그인 실패 -> ID나 PW를 다시 확인해 보세요
		
		/*if(dbId==yId&&dbPw==yPw) {
				System.out.println("로그인 성공");
		}else {
			System.out.println("ID나 PW를 다시 확인해 보세요");
		}*/
		
		if(yId==dbId) {
			if(yPw==dbPw) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("ID나 PW를 다시 확인해 보세요");
			}
		}else {
			System.out.println("ID나 PW를 다시 확인해 보세요");
		}
		
	}
}
