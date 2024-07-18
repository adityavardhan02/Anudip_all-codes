package apjfsa;

public class BankingApp {
	int accountNo;
	int balance;
	
	public BankingApp(int accountNo , int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	void depoist(int amt) {
		balance+=amt;
		System.out.println("New Balance: " +amt);
	}
	
	void withDraw(int amt) throws InsufficientBalanceException {
		if(balance >amt) {
			balance -= amt;
			System.out.println("Amount withdrawn succesfully "+amt+ "\n New Balance :"+ balance);
		}
		else
			throw new InsufficientBalanceException("Insufficient Balance");
	}

	class InsufficientBalanceException extends Exception {
		String msg;
	    public InsufficientBalanceException(String msg) {
	    	
	        super(msg);
	        this.msg = msg;
	    }
	}
	
	
	
	public static void main(String[] args) throws InsufficientBalanceException {
		BankingApp bankingApp = new BankingApp(3216532,200000);
		bankingApp.depoist(5000);
	try {	
		bankingApp.withDraw(30000);
	}catch( InsufficientBalanceException e) {
		System.out.println();
	}

}
}