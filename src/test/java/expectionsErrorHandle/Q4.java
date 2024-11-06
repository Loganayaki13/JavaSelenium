package expectionsErrorHandle;

import java.io.File;
import java.io.FileReader;

public class Q4 {

	public static void main(String[] args) {
		try
		{
			File f=new File("C:\\Users\\Asus\\eclipse-workspace\\seleniumJavaProject\\src\\test\\java\\expectionsErrorHandle");
			FileReader fr=new FileReader(f);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}
	}

}
