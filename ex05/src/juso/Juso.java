package juso;

public class Juso { //자바빈(VO:Value Object)
	//필드
	private int no; //계산할건지 생각해서 인트 or 스트링으로 하면됨. 지금같은 경우에는 no마다 1씩 증가해야되서 인트로 한것임, 연산할거아니면 스트링도 됨(주민번호 이런거)
	private String name;
	private String phone;
	private String address;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
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
	
	@Override //투스트링
	public String toString() {
		return "juso [no=" + no + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

}
