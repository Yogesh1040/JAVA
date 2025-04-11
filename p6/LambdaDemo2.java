package p6;

public class LambdaDemo2 {
	public static void main(String[] args) {
		
		StringConcat s = (a,b) -> a+b;
		System.out.println(s.conCat("Yash", " Mundhe"));
	}

}
