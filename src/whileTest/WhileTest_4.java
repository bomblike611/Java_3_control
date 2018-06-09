package whileTest;

import java.util.Scanner;

public class WhileTest_4 {
	public static void main(String[] args) {
		/*로그인 5회시도
		로그인 시도? 종료?
		로그인 성공 시 
		RPG 게임 시작.
		렙업 -> 사냥
		몬스터의 경험치는 동일
		1 ->2 3(잡아야 하는 몬스터 수)
		2 ->3 6
		3 ->4 9
		4 ->5 12
		14 ->15 42
		만렙 15!
		렙업시에 축!! 레벨업!
		5렙 달성시 -1000Gold
		10렙 달성시 - 2000Gold
		15렙 달성시 - 3000Gold*/

		//변수 설정
		Scanner sc=new Scanner(System.in);
		int dbId=1234;
		int dbPw=5678;
		int Id=0;
		int Pw=0;
		int select=0;
		int result=1;
		boolean check =false;

		//로그인 설정
		for(int i=1;i<6;i++) {
			System.out.println("======자바 월드에 오신 것을 환영합니다. 선택지를 골라주세요.======");
			System.out.println("             1.로그인 시도 2.종료");
			System.out.println("=================================================");
			select=sc.nextInt();
			switch(select) {
			case 1 :
				System.out.print("ID를 입력해주세요 : ");
				Id=sc.nextInt();
				System.out.print("PW를 입력해주세요 : ");
				Pw=sc.nextInt();
				if(Id==dbId&&Pw==dbPw) {
					i=10;
					result=15;
					check=!check;
					System.out.println("로그인에 성공하였습니다.");
				}else {
					System.out.println(i+"회 틀리셨습니다. 다시 입력해주세요.");
				}
				break;
			case 2 :
				System.out.println("=================자바월드를 종료합니다.=================");
				i=10;
				break;
			case 3 :
				System.out.println(i+"회 잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
		
		int Gold=0;
		
		for(int level=1;level<result;level++) {
			if(level%5==0) {
				Gold+=level/5*1000;
				System.out.println("보상금 지급"+Gold);
			}
			System.out.println("현재 레벨 "+level);
			
			for(int monster=1;monster<=3*level;monster++) {
				System.out.println(monster+"마리 사냥");
			}
			System.out.println("축 레벨업!");
		}
		System.out.println("15레벨 달성! 만렙입니다. 축하보상금 3000Gold 드립니다.");
		Gold+=3000;
		
		
		//내가 짠 코드! 망함! ㅅㄱ
/*		int Gold=0;
		int monster=1;
		int max=4;

		//RPG 시작!
		while(check) {
			System.out.println("사냥을 시작합니다.");
			for(int i=2;i<18;i++) {
				while(monster<max) {
					System.out.println(monster+"마리의 몬스터 공격!");
					monster++;
				}
				if(i==5){
					System.out.println("축 ! "+(i+1)+"레벨 달성!");
					System.out.println("1000골드 획득!");
					Gold+=1000;
				}else if(i==10){
					System.out.println("축 ! "+(i-1)+"레벨 달성!");
					System.out.println("1000골드 획득!");
					Gold+=2000;
				}else if(i==15) {
					System.out.println("축 ! "+(i-2)+"레벨 달성!");
					System.out.println("3000골드 획득!");
					Gold+=3000;
					System.out.println(i+"만렙이 되어 게임을 종료합니다 ! 감사합니다!");
					System.out.println("소지하고 있는 골드 : "+Gold);
					check=!check;
				}else {
					System.out.println("축 ! "+(i+1)+"레벨 달성!");
					monster=4;
					monster-=3;
					max+=3;
				}
			}

		}*/
	}
}
