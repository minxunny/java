package pm;

import java.util.*;

public class Sub01 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		ArrayList<Sale> sales=new ArrayList<>();
		Sale s1=new Sale();
		s1.code="100";
		s1.name="냉장고";
		s1.price=350;
		s1.qnt=15;
		sales.add(s1);
		Sale s2=new Sale("101","세탁기",270,25, 0);
		sales.add(s2);
		while(run) {
			System.out.println("\n\n-----------------------------------");
			System.out.println("1.매출등록|2.매출목록|3.상품조회|4.매출삭제|0.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "1": //매출등록
				Sale s3=new Sale();
				Sale last=sales.get(sales.size()-1); //마지막 코드번호
				int code=Integer.parseInt(last.code)+1; //String을 int로 바꿔주는 것
				s3.code=String.valueOf(code); //s3.code=code +""; int를 string으로 바꿔주는 것
				System.out.println("상품코드>" + s3.code);
				System.out.print("상품이름>");
				s3.name=scan.nextLine();
				if(s3.name=="")break;
				while(true) {
					System.out.print("상품가격>");
					String price=scan.nextLine();
					if(checkNumber(price)) {
						s3.price=Integer.parseInt(price);
						break;
					}
				}			
				//System.out.print("상품가격>");
				//.price=Integer.parseInt(scan.nextLine());
				//String price=scan.nextLine();
				
				while(true) {
					System.out.print("판매수량>");
					String qnt=scan.nextLine();
					if(checkNumber(qnt)) {
						s3.qnt=Integer.parseInt(qnt);
						break;
					}
				}
//				System.out.print("판매수량>");
//				s3.qnt=Integer.parseInt(scan.nextLine());
				sales.add(s3);
				System.out.println("상품등록완료!");
				break;
			case "2": //매출목록
				int tot_qnt=0;
				int tot_sum=0;
				for(Sale s:sales) {
					s.print_land();
					tot_qnt=tot_qnt+s.qnt;
					tot_sum=tot_sum+s.sum();
				}
				System.out.println("------------------------------------");
				System.out.println(sales.size()+"개 상품이 존재합니다.");
				break;
			case "3": //상품조회
				while(true) { //반복해서 계속 물어보는거 while
				System.out.println("조회할상품명/코드>");
				String sname=scan.nextLine();
				if(sname=="") break;
				boolean find=false;
				for(Sale s:sales) {
					if(s.name.equals(sname) || s.code.equals(sname)) {
						s.print_port();
						System.out.println("");
						find=true;
					}
				}
				if(!find) System.out.println(sname + "상품이 존재하지 않습니다.\n");
				}
				break;
			case "4": //매출삭제
				System.out.println("삭제할품명/코드>");
				String sname=scan.nextLine();
				boolean find=false;
				for(Sale s:sales) {
					if(s.name.equals(sname) || s.code.equals(sname)) {
						find=true;
						s.print_port();
						System.out.println("삭제하실래요?(Y/y)");
						String ans=scan.nextLine();
						if(ans.equals("Y")|| ans.equals("y")) {
							sales.remove(s);
							System.out.println("삭제완료!");
							break;
						}else {
							System.out.println("삭제취소!");
						}
						break; //for문을 빠져나간다.
					}
				}
				if(!find) System.out.println(sname + "상품이 존재하지 않습니다.\n");
				break;
			case "0":
				System.out.println("사용을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("0-4번에서 선책해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}//method
	
	//숫자인지 아닌지 판별하는 메서드
	public static boolean checkNumber(String str) {
		try { //try를 하다가 오류가 나면 catch로 빠짐
			int num=Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("숫자로 입력하세요!");
			return false;
		}
	}
	public static boolean isNumberic(String str) {
		boolean isCheck=str.matches("[+-]?\\d*(\\.\\d+)?");
		if(!isCheck) System.out.println("숫자로 입력하세요!");
        return isCheck;
		
	}
	
}
