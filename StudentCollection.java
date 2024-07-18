package apjfsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollection {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student(124,"Aditya","BSc"));
		list.add(new Student(202,"Uday","BCA"));
		list.add(new Student(303,"Tej","Btech"));
		list.add(new Student(505,"Cherry","MCA"));
		
		Student s=new Student(411,"virat","PhD");
		list.add(s);
		
		for(Student s1:list) {
			System.out.println(s1);
		}
		Collections.sort(list);
		
		for(Student s1:list) {
			System.out.println(s1);
		}
		
		
	}

}
