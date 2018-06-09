package if_Test;

public class IfTest_6 {
 public static void main(String[] args) {
	 	int kor = 100;
		int eng = 80;
		int mth = 90;
		int avr = (kor+eng+mth)/3;
		
		
		String result = " ";
		if(avr<70) {
			result="f";
		}
		if(avr>=70) {
			result ="c";
		}
		if(avr>=80) {
			result= "b";
		}
		if(avr>=90) {
			result = "A";
		}
		
		System.out.println(result);
		
 }
}
