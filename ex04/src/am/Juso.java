package am;

public class Juso { //자바빈(VO)
	//필드(속성)
	private int no;
	private String name; //private : 속성들을 밖에서 함부로 못 바꾸게 하는 것
	private String phone;
	private String address;
	
	//생성자
	public Juso(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public Juso() {
		
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//값을 출력해볼 tostring
	@Override
	public String toString() {
		return "Juso [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
