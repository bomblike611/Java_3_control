package forTest;

import java.util.Scanner;

public class ForTest_7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("시간을 입력하세요 :");
		int hour =sc.nextInt();
		System.out.print("분을 입력하세요 : ");
		int min=sc.nextInt();
		//0시 0분
		//0시 1분
		int i=0;
		int j=0;
		boolean check=false;
			for(i=0;i<24;i++) {
				for(j=0;j<60;j++) {
					System.out.println(i+"시 : "+j+"분 입니다.");
					if(i==hour&&j==min) {
						check=!check;
						break;
						}
				}
				if(check) {
					break;
					}
				}
		}
		
		
	}
