package am;

import java.util.Scanner;

public class Sub02 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		System.out.println("매출현황");
		boolean run=true;
		String[] names=new String[100]; //상품등록할 공간을 100개 만든거
		int[] prices=new int[100]; //상품등록할 공간을 100개 만든거
		int[] qnts=new int [100];
		names[0]="냉장고";prices[0]=350;qnts[0]=15; //상품등록
		names[1]="세탁기";prices[1]=250;qnts[1]=17;
		int count=2; //저장되있는 정보가 2개라서 2
		while(run) //run이 true인 동안에 계속 반복하겠다
			{System.out.println("--------------------------------------------");
			System.out.println("\t1.매출등록|2.매출현황|0.프로그램종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "1":
				System.out.println("상품명>");
				String name=scan.nextLine(); //names는 배열에서 쓰니까 name
				System.out.println("상품단가>");
				String price=scan.nextLine(); 
				System.out.println("판매수량>");
				String qnt=scan.nextLine(); 
				names[count]=name; //count번째에 이름을 넣는다
				prices[count]=Integer.parseInt(price);
				qnts[count]=Integer.parseInt(qnt);
				System.out.println(name+"상품이 등록되었습니다.");
				count=count+1;
				break;
			case "2":
				int tot_sum=0;
				int tot_qnt=0;
				for(int i=0; i<count; i++) //{}안에 있는걸 반복하겠다~
					{int sum=prices[i]*qnts[i];
					System.out.printf("%s\t%d만원\t%d개\t%,d만원\n",names[i],prices[i],qnts[i],sum);
				tot_sum=tot_sum+sum; //sum에 대한 누적합계를 구해서 tot_sum에 넣겠다는 뜻
				tot_qnt=tot_qnt+qnts[i]; //qnt[i]번째에 대한 누적합계를 구해서 tot_qnt에 넣겠다는 뜻
					}
				System.out.println("--------------------------------------------");
				System.out.printf("\t\t%d개\t%,d만원\n",tot_qnt,tot_sum);
				System.out.println("--------------------------------------------");
				
				System.out.println(count + "개 상품이 등록되었습니다.");
				break;
			case "0":
				run=false; //run=false니까 반복끝남.
				break;
			default:
				System.out.println("0-2번 메뉴를 선택하세요!");
			}//swich
		}//while
		System.out.println("프로그램을 종료합니다."); //run=false;밑에 써도 되고 여기에 써도 된다.
	}//method
}//class
