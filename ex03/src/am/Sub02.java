package am;

public class Sub02 {
	public static void run() {
		System.out.println("클래스란?");
		Student s1=new Student(); //Student(클래스)가 붕어빵틀이고 s1이 붕어빵이 되는 것!! 모양도 내용물도 같다, 생성자1응용
		s1.no="100";
		s1.name="홍길동";
		s1.juso="인천";
		s1.phone="010-2020-3030";
		s1.print();
		
		System.out.println("-----------------------------------");
		
		Student s2=new Student("101","이순신"); //생성자2응용
		s2.juso="서울";
		s2.phone="010-1010-2020";
		s2.print();
		
		System.out.println("-----------------------------------");
		
		Student s3=new Student("102","강감찬","부산","010-2020-3030");
		s3.print();
	}
}
