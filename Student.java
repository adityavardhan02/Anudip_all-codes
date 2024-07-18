package apjfsa;

public class Student implements Comparable<Student> {
	int StudentId;
	String StudentName;
	String qualification;
	
	public Student(int studentId, String studentName, String qualification) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		this.qualification = qualification;
	}
		
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", qualification=" + qualification
				+ "]";
	}


	

	public Student() {
		super();
	}


	@Override
	public int compareTo(Student o) {
		if (this.StudentName.compareTo(o.StudentName)>0)
			return 1;
		else if (this.StudentName.compareTo(o.StudentName)<0)
			return -1;
		else
		return 0;
	}
		
		
	
		

	}


