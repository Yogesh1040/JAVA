package p6;

public class LambdaDemo3 {
	public static void main(String[] args) {

		/*
		 * Runnable r = () -> { int sum = 0; for (int i = 1; i <= 5; i++) { sum += i; }
		 * System.out.println("Sum - " + sum); }; new Thread(r).start();
		 */
		
		new Thread(() -> {
			int sum = 0;
			for (int i = 1; i <= 5; i++) {
				sum += i;
			}
			System.out.println("Sum - " + sum);
		}).start();
	}
}
