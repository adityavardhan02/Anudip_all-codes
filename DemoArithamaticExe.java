package apjfsa;

public class DemoArithamaticExe {

	public static void main(String[] args) {
		
		int a,b,c;
		a=100;
		b=0;
		System.out.println("start of the code");
		try {
			for(int i=0;i<5;i++) {
			
			}
		c=a/b;
		System.out.println("c="+c);
		}catch(ArithmeticException ae) {
			System.out.println("exeception caught");
			}
		finally {
		System.out.println("End of the code");
	}

}
}

