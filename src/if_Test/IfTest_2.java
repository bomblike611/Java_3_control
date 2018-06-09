package if_Test;

public class IfTest_2 {

	public static void main(String[] args) {

		/*월급이 300만원 이상이면 세금을 3.3%빼고 수령
		월급이 300만원 미만이라면 수령*/
		
		int money=300;
		
		if(money>=300)
			money=(int)(money-money*0.033);
		System.out.println(money+"만원 수령");
		

	}

}
