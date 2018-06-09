package if_Test;

public class IfTest_1 {

	public static void main(String[] args) {
	//나이가 20세 이상이면 술..
	//가지고 있는 돈이 4000미만이면 맥주
	//4000 이상이면 소주
		
		
		int age = 20;
		int money=3000;
		String wine="맥주";
		
		if(age>19) {
		
			if(money>=4000) {
				wine ="소주";
			}
			System.out.println(wine);	
			System.out.println("짠~");
				
		}
		
		System.out.println("귀가");
		
	}

}
