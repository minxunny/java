package ex01;

public class Sub04 {
	public static void run() {
		//산술연산자
		int num1=11;
		int num2=3;
		int sum=num1+num2;
		System.out.println(num1+"+"+num2+"="+sum);
		int sub=num1-num2;
		System.out.println(num1+"-"+num2+"="+sub);
		int mul=num1*num2;
		System.out.println(num1+"*"+num2+"="+mul);
		float div=(float)num1/num2; //float=나머지 소수점까지 출력된다.
		System.out.println(num1+"/"+num2+"="+div);
		
		//관계연산자
		boolean result=num1>num2;
		System.out.println(num1+"이"+num2+"보다 크다:"+result);
		result=num1<num2; //위에서 boolean 썼기때문에 또 쓰면 오휴가 난다. 만약 또 쓰고싶으면 다른 변수를 써야된다.
		System.out.println(num1+"이"+num2+"보다 작다:"+result);
		result=num1==num2; //==:같다.
		System.out.println(num1+"과"+num2+"가 같다:"+result);
		result=num1!=num2; //!=:같지않다.
		System.out.println(num1+"과"+num2+"가 같지않다:"+result);
		
		//논리연산자(and(두개가 트루일때), or(하나만 트루일때), not(둘다 펄스일때))
		boolean b1=true;
		boolean b2=false;
		result = b1 && b2; //and : &&
		System.out.println(result);
		result = b1 || b2; //or : ||
		System.out.println(result);
		result = !b1;
		System.out.println(result);
	}
}
