package apjfsa;

public class JavaBatch {

	public static void main(String[] args) {
		Student[] students=new Student[5];
		
		students[0]=new Student(1,"Ram",20);
		students[1]=new Student(2,"Sam",21);
		students[2]=new Student(3,"Adi",22);
		students[3]=new Student(4,"sai",23);
		students[4]=new Student(5,"Tej",24);
		
		int i;
		for(i=0;i<5;i++) {
			System.out.println(students[i]);
		}

	}

}
