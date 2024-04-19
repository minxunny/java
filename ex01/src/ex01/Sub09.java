package ex01;

import java.util.Scanner;

public class Sub09 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		String[] names=new String[100];
		String[] jusos=new String[100];
		String[] phones=new String[100];
		names[0]="홍길동";
		jusos[0]="인천 서구 경서동";
		phones[0]="010-1010-2020";
		names[1]="심청이";
		jusos[1]="인천 부평구 부평동";
		phones[1]="010-1010-4040";
		int  count=2;
		
		while(run==true) //run이 true인 동안에 반복하라는 뜻
			{System.out.println("---------------------------------");
			System.out.println("1.주소등록|2.주소출력|0.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "1":
				System.out.println("이름>");
				String name=scan.nextLine();
				System.out.println("주소>");
				String juso=scan.nextLine();
				System.out.println("전화>");
				String phone=scan.nextLine();
				names[count]=name;
				jusos[count]=juso;
				phones[count]=phone;
				count=count+1;
				break;
			case "2":
				for(int i=0; i<count; i=i+1) {
					System.out.printf("%s\t%s\t%s\n",names[i],phones[i],jusos[i]);
				}
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("0~2번 메뉴를 선택하세요!");
			}//switch
		}//while
	}//method
}//class
