package p6;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		HelloWorld h = () -> {return "Hello World";};
		System.out.println(h.sayHello());
		
		HelloWorld h1 = () -> "Hello World 123 ";
		System.out.println(h1.sayHello());
	}

}
