package pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열은 차례대로 데이터가 들어가고 중간 데이터 삭제가 불가능하다. ArrayList는 차례가 없고 계속 넣으면 되고 중간 데이터 삭제가 가능하다.
		Scanner scan=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>(); //ArrayList는 크기 지정 안해도 되고 바구니만 하나 만드는 거랑 동일하다 names에 바구니 하나 만든거임
		names.add("홍길동");
		names.add("심청이"); //names 바구니에 홍길동, 심청이 넣음, string이라서 숫자는 못 넣음
		//ArrayList는 size함수써야함
		names.add("강감찬");
		names.add("성춘향");
		names.add("이몽룡");
		
		names.remove(1); //names에서 삭제방법
		for(int i=0; i<names.size();i++) {  //데이터 전체출력방법
			String name=names.get(i);
			System.out.println(name);
		}
		
		//names에서 이름검색방법
		while(true) {
			System.out.println("검색할이름>");
			String sname=scan.nextLine();
			if(sname=="") {
				System.out.println("검색을 종료합니다.");
				break;
			}
			int index=-1;
			for(int i=0;i<names.size();i++) {
				String name=names.get(i);
				if(sname.equals(name)) {
					index=i+1; //1번째가 0이니까 +1해줘서 순서 맞춰주기!
				}
			}
			if(index==-1) {
				System.out.println("존재하지않습니다.");
			}else {
				System.out.println(index+"번째 존재합니다.");
			}
		}
	}
}
