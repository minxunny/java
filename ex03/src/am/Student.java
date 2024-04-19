package am;

public class Student {
	//필드(class가 모두 가질 수 있는 속성)
	String no;
	String name;
	String juso;
	String phone;
	
	
	//생성자1
	public Student() {
		
	}
	


	//생성자2
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
	}
	
	//생성자3
	public Student(String no, String name, String juso, String phone) { //소스-제너레이트어쩌고유징필드
		super(); //super는 있어도 되고 없어도 됨
		this.no = no;
		this.name = name;
		this.juso = juso;
		this.phone = phone;
	}
	
	
	//메서드
	public void print() {
		System.out.printf("학번:%s\n이름:%s\n주소:%s\n전화번호:%s\n",no, name, juso, phone);
	}
}
