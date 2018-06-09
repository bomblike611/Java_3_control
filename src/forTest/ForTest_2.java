package forTest;

public class ForTest_2 {
	public static void main(String[] args) {
		//1부터 100사이의 숫자중에서 짝수만을 출력
		//1부터 100사이의 숫자중에서 2와 7의 공배수를 출력
		
		
		System.out.println("1번 문제");
		int twin=0;
		for(int i=1;i<101;i++) {
			if(i%2==0) {
			System.out.print(" "+i);}
		}
		System.out.println(" ");
		System.out.println("2번 문제");
		
		for(int i=1;i<101;i++) {
			if(i%2==0&&i%7==0) {
			
				System.out.print(" "+i);
			}
		}
		System.out.println(" ");
		System.out.println("3번 문제");
		//1부터 100사이의 숫자 중 홀수 출력 하는데 if문을 사용하지 않고 찍기
		
		for(int i=1;i<101;i+=2) {
			System.out.print(" "+i);
			
		}
		
		
		
		
		
		
	}
}
