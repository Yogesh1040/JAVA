package p5;

public class Test {
	public static void main(String[] args) {

		String s1 = "Yash";
		String s2 = "Yash2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("Thread1 acquire lock on resource 1");
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				synchronized (s2) {}
				
				System.out.println("Thread1 got resouce 2");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("Thread2 acquire lock on resource 2");
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				synchronized (s1) {}
				
				System.out.println("Thread2 got resouce 1");
				}
			}
		};
		t1.start();
		t2.start();

	}

}
