package ex01;

public class Sub06 {
	public static void run() {
		//반복문(for, while)
		int sum=0;
		for(int i=1; i<=100; i=i+1) { //1씩 증가해서 i에 저장한다.
			//System.out.println(i);
			sum=sum+i; //i에 대한 누계를 sum에 저장한다.
		}
		System.out.println("1~100까지 합계:"+sum);
		
		sum=0;
		for(int i=1; i<=100; i=i+2) {
			sum=sum+i;
		}
		System.out.println("1~100까지 홀수 합계:"+sum);
		
		sum=0;
		for(int i=0; i<=100; i=i+2) {
			sum=sum+i;
		}
		System.out.println("1~100까지 짝수 합계:"+sum);
		
		int i=1;
		sum=0; //sum 시작할때마다 sum=0;해줘야함
		while(i<=100) {
			sum=sum+i;
			i=i+1;			
		}
		System.out.println("1~100까지 합계:"+sum);
		
		i=1;
		sum=0;
		while(i<=100) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println("1~100까지 홀수 합계:"+sum);
		
		i=0;
		sum=0;
		while(i<=100) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println("1~100까지 짝수 합계:"+sum);
	}
}
