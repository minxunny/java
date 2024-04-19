package am;

import java.util.*;

public class Sub01 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<String>();
		ArrayList<Integer> kors=new ArrayList<>();
		ArrayList<Integer> engs=new ArrayList<>();
		ArrayList<Integer> mats=new ArrayList<>();
		names.add("홍길동");kors.add(80);engs.add(77);mats.add(82);
		names.add("강감찬");kors.add(90);engs.add(87);mats.add(83);
		while(run) { //!run = run이 false인 동안에 실행하겠다는 뜻(= run!=true, run==false)
			System.out.println("\n\n-------------------------------------------");
			System.out.println("1.성적등록|2.성적목록|3.성적조회|4.성적삭제|0.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "0":
				run=false;
				break; //switch문을 빠져나가는 것임 while문 빠져나가는게 아님
			case "1": //성적등록
				System.out.println("이름<");
				names.add(scan.nextLine());
				System.out.println("국어<");
				kors.add(Integer.parseInt(scan.nextLine()));
				System.out.println("영어<");
				engs.add(Integer.parseInt(scan.nextLine()));
				System.out.println("수학<");
				mats.add(Integer.parseInt(scan.nextLine()));
				System.out.println("등록완료!");
				break;
			case "2": //성적목록
				int sum_kor=0;
				int sum_eng=0;
				int sum_mat=0;
				for(int i=0;i<names.size();i++) {
					int tot=kors.get(i)+engs.get(i)+mats.get(i);
					double avg=tot/3.;
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",names.get(i),kors.get(i),engs.get(i),mats.get(i),tot,avg);
					sum_kor=sum_kor+kors.get(i);
					sum_eng=sum_eng+engs.get(i);
					sum_mat=sum_mat+mats.get(i);
					
				}
				System.out.println("-------------------------------------------");
				System.out.printf("평균:\t%.2f\t%.2f\t%.2f\n",
						sum_kor/(double)names.size(),sum_eng/(double)names.size(),sum_mat/(double)names.size());
				System.out.println("-------------------------------------------");
				System.out.println(names.size()+"명 성적이 존재합니다.");
				break;
			case "3": //성적조회
				System.out.println("조회할 이름>");
				String sname=scan.nextLine();
				boolean find=false;
				for(int i=0;i<names.size();i++){
					if(names.get(i).equals(sname)) {
						System.out.println("국어:"+kors.get(i));
						System.out.println("영어:"+engs.get(i));
						System.out.println("수학:"+mats.get(i));
						int tot=kors.get(i)+engs.get(i)+mats.get(i);
						System.out.println("총점:"+tot);
						System.out.printf("평균:"+"%.2f\n",tot/3.);
						find=true;
					}
				}
				if(!find) System.out.println(sname +"학생이 존재하지 않습니다.");
				break;
			case "4": //성적삭제
				System.out.print("삭제할이름>");
				String sname1=scan.nextLine();
				boolean find1=false;
				for(int i=0; i<names.size();i++) {
					String name=names.get(i);
					if(sname1.equals(name)) {
						System.out.println("이름:"+names.get(i));
						find1=true;
						System.out.print("삭제하실래요(Y/y)?");
						String answer=scan.nextLine();
						if(answer.equals("Y") || answer.equals("y")) {
							names.remove(i);
							kors.remove(i);
							engs.remove(i);
							mats.remove(i);
							System.out.println("삭제완료!");
							break;
						}else {
							System.out.println("삭제취소!");
						}
						if(!find1) {
							System.out.println(sname1+"이(가) 존재하지 않습니다.");
						}
					}
				}
				break;
			default:
				System.out.println("0-4번 메뉴를 선택하세요!");
			}//swtich
		}//while
		System.out.println("프로그램을 종료합니다.");
	}
}
