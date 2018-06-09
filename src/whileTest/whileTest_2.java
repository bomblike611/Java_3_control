package whileTest;

import java.util.Scanner;

public class whileTest_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dbId=1234;
		int dbPw=5678;

		while(true) {
			System.out.print("1.로그인 2.종료 : ");
			int id=sc.nextInt();
			if(id==1) {
				System.out.print("ID를 입력해주세요 : ");
				id=sc.nextInt();
				System.out.print("PW를 입력해주세요 : ");
				int pw=sc.nextInt();

				if(dbId==id&&dbPw==pw) {
					System.out.println("로그인 성공 !");
					break;
				}else {
					System.out.println("다시 입력해주세요.");
				}
			}else if(id==2){
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
		//스위치문을 사용할 수도 있음. 이 상황에서는 break대신 boolean check=true 변수를 선언하여 조건에 맞을 시에 false로 바꾸어 반복문 탈출


	}
}
