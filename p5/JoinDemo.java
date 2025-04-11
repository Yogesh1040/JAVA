package p5;

public class JoinDemo implements Runnable
{

	@Override
	public void run() {
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		JoinDemo j1 = new JoinDemo();
		Thread t1 = new Thread(j1,"One");
		Thread t2 = new Thread(j1,"Two");
		Thread t3 = new Thread(j1,"Three");
		t1.start();
		t2.start();
		t2.join();
		t1.join();
		t3.join();
		
		t3.start();
		
	}

}
