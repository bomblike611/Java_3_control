package forTest;

import java.util.Scanner;

public class Fortest_8 {
	public static void main(String[] args) {
		//FPS
		//총알 : 30발
		//탄창 : 3개
		Scanner sc=new Scanner(System.in);
		String sound="탕";
		int round= 30;
		
		//내가 짠 코드
		/*for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2.점사");
			int mode=sc.nextInt();
			if(mode==1) {
			for(int bullet=0;bullet<30;bullet++) {
				System.out.print(sound);
				}
			}else{
				for(int bullet=0;bullet<10;bullet++) {
					System.out.print("타다당 ");
					}
				}
			System.out.println("철커덕 철커덕");*/
		
		
		//선생님 코드
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2.점사");
			int mode=sc.nextInt();
			
			if(mode==2) {
				sound="타다당";
				round=3;
			}else {
				sound="탕";
				round=1;
			}
			
			for(int bullet=0;bullet<30;bullet=bullet+round) {
				System.out.println(sound);
				}
				System.out.println("철커덕 철커덕");
				}
		
		
	}
	}
