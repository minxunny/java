package am;

import java.util.*;

public class Sub02_1 { //Sub02랑 똑같은데 이렇게 하면 간단하다!
	public static void run() {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("100","홍길동","인천","010-2020-6060"));
		students.add(new Student("101","강감찬","서울","010-2020-1010"));
		students.add(new Student("102","이순신","부산","010-2020-3030"));
		
		for(Student s:students) {
			s.print();
			
			
		}
		for(int i=0;i<students.size();i++) {
			Student s=students.get(i);
			s.print();
		}
	}
}
