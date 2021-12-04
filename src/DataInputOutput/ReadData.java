package DataInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		FileInputStream input=new FileInputStream("abc.txt");
		}
		catch(FileNotFoundException file) {
			System.out.println(file.getMessage());
			System.out.println(file.getCause());
			file.printStackTrace();
		}
	}

}
