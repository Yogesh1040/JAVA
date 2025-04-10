package p4;

public class MyThread1 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1; i<=3; i++)
		{
			System.out.println((Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority()+" "+i));
			
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	}
	
	public static void main(String[] args) {
		
		MyThread1 r = new MyThread1();
		Thread t1 = new Thread(r);
		MyThread1 r1 = new MyThread1();
		Thread t2 = new Thread(r1);
		MyThread1 r2 = new MyThread1();
		Thread t3 = new Thread(r2);
		
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
