package am;

import java.util.*;

public class Sub01 {
	   public static void run() {
		      boolean run=true;
		      ArrayList<Car> cars=new ArrayList<>();
		      Scanner scan=new Scanner(System.in);
		      Car car=new Car(1,"현대","그랜저","검정색",20000,"2020-03");
		      cars.add(car);
		      car=new Car(2,"쌍용","티볼리","흰색",30000,"2020-02");
		      cars.add(car);
		      car=new Car(3,"기아","K7","파랑색",55000,"2022-07");
		      cars.add(car);
		      while(run) {
		         System.out.println("--------------------------------------------");
		         System.out.println("1.차량등록|2.차량조회|3.차량목록|4.차량삭제|0.종료");
		         System.out.println("--------------------------------------------");
		         System.out.print("선택>");
		         String menu=scan.nextLine();
		         switch(menu) {
		         case "1": //차량등록
		        	 car=new Car();
						System.out.println("넘버>");
						car.setNo(Integer.parseInt(scan.nextLine()));
						System.out.println("회사>");
						String company=scan.nextLine();
						car.setCompany(company);
						System.out.println("모델>");
						String model=scan.nextLine();
						car.setModel(model);
						System.out.println("컬러>");
						String color=scan.nextLine();
						car.setColor(color);
						System.out.println("주행거리>");
						car.setDistance(Integer.parseInt(scan.nextLine()));
						System.out.println("연식>");
						String date=scan.nextLine();
						car.setDate(date);
						
						cars.add(car);
						System.out.println(car.toString()+"\n"+"등록완료!");
						System.out.println("등록된 차량수 :"+cars.size());
		            break;
		         case "2": //차량조회
						while(true) {
							System.out.print("조회할차량<");
							String sno=scan.nextLine();
							if(sno=="") break;
							boolean find=false;
							for(Car C:cars) {
								if(Integer.parseInt(sno)==C.getNo()) { 
									System.out.println("회사:"+C.getCompany());
									System.out.println("모델:"+C.getModel());
									System.out.println("컬러:"+C.getColor());
									System.out.println("주행거리:"+C.getDistance());
									System.out.println("연식:"+C.getDate());
									find=true;
								}//if
							}//for+
							if(find==false) System.out.println(sno+"번 차량이 존재하지 않습니다.");
						} //while
		            break;
		         case "3": //차량목록
		            break;
		         case "4": //차량삭제
		            break;
		         case "0":
		            System.out.println("프로그램을 종료합니다.");
		            run=false;
		            break;
		         default:
		            System.out.println("0~4메뉴를 선택하세요!");
		         }//switch
		      }//while
	   }//run  
}//class