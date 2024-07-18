package apjfsa;

public class Singals {

	String signal;

	synchronized void green(String signal) throws InterruptedException {
		this.signal=s;

		if (signal.compareToIgnoreCase("green")!=0)
			wait();
		System.out.println("The signal is green:now you can move"+signal);
	}

	synchronized void red(String signal) {
		System.out.println("The signal is red: wait for 5 mins"+signalS);

		this.signal = "green";
		notify();
	}

	public static void main(String[] args) {

	}

}
