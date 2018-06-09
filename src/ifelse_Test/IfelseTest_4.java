package ifelse_Test;

import java.util.Scanner;

public class IfelseTest_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//ATM
		//입금,출금,조회,종료
		//입금 - 입금할 금액 입력, 입금후 잔액
		//출금 - 출금할 금액 입력, 출금후 잔액
		//통장잔고 조회
		//종료
		
		int deposit=10000;
		System.out.println("1.입금 2.출금 3.조회 4.종료");
		int select = sc.nextInt();
		
		if(select==1) {
			System.out.print(deposit+"원이 있습니다. 얼마를 입금하시겠습니까? :");
			int money =sc.nextInt();//select =sc.nextInt();를 사용해도 무방
			deposit+=money;
			System.out.print("현재"+deposit+"원이 있습니다.");
		}else if(select==2) {
			System.out.print(deposit+"원이 있습니다. 얼마를 출금하시겠습니까? :");
			int money =sc.nextInt();
			if(deposit<money) {
				System.out.println("잔액이 부족합니다. 돈을 입금해주세요.");
				deposit+=money;
			}
			deposit-=money;
			System.out.print("현재 "+deposit+"원이 있습니다.");
		}else if(select==3) {
			System.out.print(deposit+"원이 있습니다.");
		}else {
			System.out.println("종료합니다.");
		}
		
		
		
		
	}
}
