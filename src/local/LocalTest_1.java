package local;

public class LocalTest_1 {
	public static void main(String[] args) {
		boolean check=true;

		//{}안에 선언된 변수를 지역 변수


		int age = 30;
		if(check) {
			age=40;
			System.out.println("if문 들어 옴");
			System.out.println(age);
		}

		System.out.println(age);
	}
}
