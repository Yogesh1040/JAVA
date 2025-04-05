package p2;

import java.io.FileOutputStream;
import java.io.IOException;

public class File 
{
	public static void main(String[] args) throws IOException {
		
		String str=" Hello";
		FileOutputStream fos=new FileOutputStream("C:\\Users\\group023\\Desktop\\abc.txt",true);
		byte[] b=str.getBytes();
		fos.write(b);
		System.out.println("success");
		fos.close();
	}

}
