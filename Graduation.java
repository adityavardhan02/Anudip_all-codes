package anudip;

public class Graduation {
	
	String courseName;
	int no_ofYears;
	int coursefee;
	
	public Graduation(String courseName,int no_ofYears) {
		super();
		this.courseName= courseName;
		this.no_ofYears= no_ofYears;
	}
	void courseDetails() {
		System.out.println("Course details:"+courseName+","+no_ofYears);
	}
	}
