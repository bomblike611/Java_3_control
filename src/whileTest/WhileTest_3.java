package whileTest;

import java.util.Scanner;

public class WhileTest_3 {
	public static void main(String[] args) {
		//로그인을 5회 시도
		//로그인이 성공 했을 경우에만 밑의 코드 실행
		int dbId=1234;
		int dbPw=5678;
		Scanner sc=new Scanner(System.in);
		int deposit=10000;
		boolean check=false;

		
		for(int i=0;i<5;i++) {
			System.out.println("1.로그인 2.종료");
			int select =sc.nextInt();
			if(select==1) {
				System.out.println("ID입력");
				int yId=sc.nextInt();
				System.out.println("PW입력");
				int yPw=sc.nextInt();
				if(yId==dbId&&yPw==dbPw) {
					System.out.println("로그인 성공");
					check=!check;
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				break;
			}
		}
		
		
		
/*		while(checked) {
			System.out.println("===번호를 입력해주세요===");
			System.out.println("   1.로그인 2.종료      ");
			int select=sc.nextInt();
			if(select==1) {
				for(int i=1;i<6;i++) {
					System.out.print("아이디를 입력해주세요 :");
					int id=sc.nextInt();
					System.out.print("비밀번호를 입력해주세요 :");
					int pw=sc.nextInt();
					if(dbId==id&&dbPw==pw) {
						System.out.println("/////////입출금 선택란으로 이동합니다/////////");
						i=70;
						checked=!checked;
						check=!check;
					}else {
						System.out.println(i+"회 잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				}
				check=!check;
				break;
			}
			else if(select==2) {
				System.out.println("종료합니다.");
				check=!check;
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}*/




		//입출금 
		//1.입금 2.출금 3.조회 4.종료


		while(check) {
			System.out.println("=====무엇을 하시겠습니까?=====");
			System.out.println(" 1.입금 2.출금 3.조회 4.종료 ");
			int select =sc.nextInt();
			switch(select){
			case 1 : 
				System.out.print("얼마를 입금하시겠습니까? : ");
				int money=sc.nextInt();
				deposit+=money;
				System.out.println("현재금액은 "+deposit+"원이 있습니다.");
				break;
			case 2 :
				System.out.println("얼마를 출금하시겠습니까? : ");
				money=sc.nextInt();
				if(deposit<money) {
					System.out.println("잔액이 부족합니다. 돈을 입금해주세요.");
				}else {
					deposit-=money;
					System.out.println("현재금액은 "+deposit+"원이 있습니다.");
				}
				break;
			case 3 :
				System.out.println("현재금액은 "+deposit+"원이 있습니다.");
				break;
			case 4 :
				System.out.println("종료합니다.");
				check=!check;
				break;
			default :
				System.out.println("===잘못 입력하셨습니다. 다시 입력해주세요.===");
				break;
			}
		}

	}
}
