package ifLast_Test;

import java.util.Scanner;

public class ifLast_2 {
	public static void main(String[] args) {
		//임의의 숫자(학번)를 입력
		//1반에 배정, 2반에 배정, 3반에 배정, 4반에 배정
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int number = sc.nextInt();
		
		if(number%4==1) {
			System.out.println("1반에 배정되었습니다.");
		}else if(number%4==2) {
			System.out.println("2반에 배정되었습니다.");
		}else if(number%4==3){
			System.out.println("3반에 배정되었습니다.");
		}else {
			System.out.println("4반에 배정되었습니다.");
		}
		
	}
}
