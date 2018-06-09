package ifLast_Test;

import java.util.Scanner;

public class IfLast_1 {
	public static void main(String[] args) {
		//임의의 숫자를 입력
		//짝수면 입력하신 숫자는 짝수입니다.
		//홀수면 입력하신 숫자는 홀수입니다.
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
	}
}
