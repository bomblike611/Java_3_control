package forTest;

import java.util.Scanner;

public class ForTest_3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("분을 입력 :");
		int min = sc.nextInt();
		for(int i=0;i<60;i++) {
	         System.out.println(i+"분");
	         if(min==i) {
	        	break;
	         }
		}
		System.out.println("ㅎㅎ");
		
	}
}
