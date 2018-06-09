package if_Test;

public class IfTest_3 {
	
/*국어,영어,수학 성적을 가지고 평균 90점 이상이면 우등상 수상
  그중에서 평균이 95점 이상이면 장학금 수령 그리고 졸업*/
	
	public static void main(String[] args) {
		
		int korean = 97;
		int english = 99;
		int math = 98;
		int average = (korean+english+math)/3;
		
		if(average>=90) {
			System.out.println("우등상 수상");
			if(average>=95) {
				System.out.println("장학금 수상");
			}
		}
		System.out.println("졸업");
		
		
	}
	
}
