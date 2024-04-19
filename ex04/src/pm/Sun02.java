package pm;
import java.io.*;
import am.Juso;
import java.util.*;

public class Sun02 {
	public static void insert() {
		System.out.println("************주소등록*************");
		File file=new File("c:/data/java/address.txt");
		Scanner scan=new Scanner(System.in);
		try {
			FileWriter writer =new FileWriter(file, true);
			Juso juso=new Juso();
			System.out.print("번호>");
			juso.setNo(Integer.parseInt(scan.nextLine()));
			System.out.print("이름>");
			juso.setName(scan.nextLine());
			System.out.print("전화>");
			juso.setPhone(scan.nextLine());
			System.out.print("주소>");
			juso.setAddress(scan.nextLine());
			writer.write(juso.getNo()+","
					+juso.getName()+","+juso.getPhone()+","+juso.getAddress()+"\n");
			writer.flush();
			writer.close();
			System.out.println("등록완료!");
		} catch (IOException e) {
			System.out.println("파일이존재하지 않습니다.");
		}
	}
	
	public static void run() {
		File file=new File("c:/data/java/address.txt");
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line="";
			String[] items=new String[4];
			while((line=reader.readLine())!=null) {
				items=line.split(",");
				Juso juso=new Juso();
				juso.setNo(Integer.parseInt(items[0]));
				juso.setName(items[1]);
				juso.setPhone(items[2]);
				juso.setAddress(items[3]);
				
				System.out.printf("%d\t%s\t%s\t%s\n",
						juso.getNo(),juso.getName(),juso.getPhone(),juso.getAddress());
			}
		}catch(Exception e) {
			//System.out.println("오류:" + e.toString());
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}