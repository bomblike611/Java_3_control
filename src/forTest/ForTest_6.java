package forTest;

public class ForTest_6 {
	public static void main(String[] args) {
		//오타, 문법 신경쓸것
		
		for(int i=0;i<5;i++) {
			for(int j=-1;j<i;j++) {
				System.out.print("*");
			}//안쪽 for 끝
			System.out.println();
		}//바깥쪽 for 끝
	
		System.out.println("==============================");
		
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		
		/*
		
		*
		**
		***
		****
		*****
		
		*/
		
	}
}
