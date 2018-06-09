package if_Test;

public class IfTest_5 {
	public static void main(String[] args) {
		//국어,영어,수학 입력
		//평균을 구함
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//그외 F를 출력
		
		int kor = 100;
		int eng = 80;
		int mth = 90;
		int avr = (kor+eng+mth)/3;
		
		if(avr>=90&&avr<=100) {
			System.out.println("A");
		}
		if(avr>=80&&avr<90) {
			System.out.println("B");
		}
		if(avr>=70&&avr<80) {
			System.out.println("C");
		}
		if(avr<70)
			System.out.println("F");
		
	}
}
