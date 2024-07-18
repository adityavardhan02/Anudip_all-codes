package apjfsa;

public class InsufficientBalanceException extends Exception {
	
	Stirng msg;
	

	public static void main(String msg) {
		super(msg);
		this.msg=msg;
	}

}
