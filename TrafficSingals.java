package apjfsa;

public class TrafficSingals {

			
	public static void main(String[]args) {
		
		Singals sig=new Singals();
		
		Thread thread=new Thread() {
			public void run() {
			try {
				sig.green("red");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		thread.start();
		
		Thread thread1=new Thread() {
			public void run() {
				sig.red("green");
			}
		};
		thread1.start();
		}
}
}

