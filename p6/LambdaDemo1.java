package p6;

public class LambdaDemo1 {
	public static void main(String[] args) {
		
		Increment i = (a) -> a+a;
		int sum = i.incByTen(5);
		System.out.println("Sum - "+sum);
	}

}
