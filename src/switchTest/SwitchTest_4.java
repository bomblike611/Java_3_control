package switchTest;

import java.util.Scanner;

public class SwitchTest_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String n1 = "iu";
		String n2 = "iu";
		
		System.out.println("이름을 입력하세요 : ");
		String n3=sc.next();
		System.out.println(n1==n3);
	}
}
