package if_Test;

public class IfTest_4 {

	public static void main(String[] args) {
		int korean = 90;
		int english = 90;
		int math = 90;
		int average = (korean+english+math)/3;
		
		if(average>=90) {
			System.out.println("우등상 수상");
		}
		if(average>=95) {
			System.out.println("장학금 수상");
		}
		System.out.println("졸업");
	}

}
