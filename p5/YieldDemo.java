package p5;

public class YieldDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			try {
				Thread.currentThread();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 2) {
				Thread.yield();
			} else {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new YieldDemo());
		Thread t2 = new Thread(new YieldDemo());
		Thread t3 = new Thread(new YieldDemo());

		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");

		//t2.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
}
