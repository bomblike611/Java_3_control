package forTest;

public class ForTest_1 {
	public static void main(String[] args) {
		/*for 지정된 횟수 만큼 반복
		for(초기식;조건식;증감식){
                반복해야될 코드		
		}*/
		
		/*
		for(int i=0;i<3;i++) {
			System.out.println("Hello, Java!");
		}
		
		//1~9
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
		
		//1부터 10까지의 합을 구하세요
		//for문을 이용해서 결과를 출력 55
		*/
		int num=0;
		for(int i=1;i<11;i++) {
			num+=i;
		}
		System.out.println(num);
		
		
	}
}
