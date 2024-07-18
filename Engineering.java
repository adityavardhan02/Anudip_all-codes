package anudip;

public class Engineering extends Graduation {

	String branchName;
	int no_ofSubjects;
	int coursefee;
	
	
	public Engineering(String courseName,int no_ofYears,String branchName,int no_of) {
		super(courseName,no_ofYears);
		this.branchName= branchName;
		this.no_ofSubjects= no_ofYears;
	}
	
	void courseDetails(int fee) {
		coursefee=fee;
		super.coursefee=fee;
		super.courseDetails();
		System.out.println("Engineering Degree details:Branch name:"+branchName+",No_of subjects:"+no_ofSubjects);
	}

	public static void main(String[] args) {
		Engineering btech=new Engineering("Btech",4,"CSE",6);
		
		btech.courseDetails(55000);
	}

}
