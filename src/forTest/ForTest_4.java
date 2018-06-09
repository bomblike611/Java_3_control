package forTest;

public class ForTest_4 {
	public static void main(String[] args) {
		//a~z 출력
		
		//for(int i=97;i<=122;i++){
		// System.out.println((char)i);}
		
		int num= 'a';
		System.out.println(num);
		num='A';
		System.out.println(num);
		
		
		for(int i='a';i<='z';i++) {
			System.out.println((char)i);
		}
		
		//소문자 a부터 z까지, 대문자 A부터 Z까지
		
		System.out.println("========================================================");
		int first=97;
		int second=122;
		
		for(int i=first;i<=second;i++) {
			System.out.println((char)i);
			if(i==122) {
				i=64;
				second=90;
			}
		}
		System.out.println("========================================================");
		
		for(char a='a';a<='z';a++) {
			System.out.println(a);
			}
		for(char b='A';b<='Z';b++) {
			System.out.println(b);
		}
		
		int i;
		for(i=1;i<=10;i++)
		{
		  System.out.println("Hello");
		  for(int j=i;j<5;j++){
			System.out.println("Java");
		  }  }
		
	}
}
