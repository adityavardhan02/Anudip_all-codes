package anudip;

public class studnentresult {

	public static void main(String[] args) {
		int[]marks= {43,54,43,54,65,32};
		boolean b;b=true;
		int i=0,sum=0;
		double percentage;
		for(;i<marks.length;) {
			if(marks[i]<=35)
				b=false;
			i++;
				
		}
		if(b) {
			for(i=0;i<marks.length;i++) {
				sum+=marks[i];
				
			}
			percentage=sum/6;
			System.out.println("Student Result:Total="+sum+"percentage="+percentage);
		}
		else
		{
			System.out.println("Student got Failed Better luck next time");
		}
			
	}

}
