package switchTest;

import java.util.Scanner;

public class SwitchTest_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt();
		
		/*switch(정수값){
		  case 상수값(변수넣으면 안댐) :
		}
		*/
		switch(num) {
		case 1 :
			System.out.println("1 번");
			break;
		case 2 :
			System.out.println("2 번");
			break;
		case 3:
			System.out.println("3 번");
			break;
		default :
			System.out.println("그 외 나머지");
			break;
		}
	}
	
}
