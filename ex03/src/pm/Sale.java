package pm;

public class Sale { //public이 없으면 pm에서만 쓸 수 있고 있으면 am에서도 쓸 수 있음! 그 뜻임
	//필드
	String code;
	String name;
	int price;
	int qnt;
	int sum;
	
	//기본생성자
	public Sale() {
		
	}
	
	
	public Sale(String code, String name, int price, int qnt, int sum) {
		super(); //super은 있어도 되고 없어도 됨
		this.code = code;
		this.name = name;
		this.price = price;
		this.qnt = qnt;
		this.sum = sum;
	}


	//금액을 구하는 메서드
	public  int sum() { //14,15줄 int부분이 같아야함!
		int sum=price*qnt;
		return sum;
	}
	
	//내용을 가로로 출력하는 메서드
	public void print_land() {
		System.out.printf("%s\t%s\t%d\t%d\t%d\n",code,name,price,qnt,price,sum());
	}
	
	//내용을 세로로 출력하는 메서드
	public void print_port() {
		System.out.printf("코드:%s\n", code);
		System.out.printf("이름:%s\n", name);
		System.out.printf("가격:%d만원\n", price);
		System.out.printf("수량:%d개\n", qnt);
		System.out.printf("금액:%,d만원\n", sum());
	}

}
