package filehandlingtopic;

import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		File f1=new File("c:\\users\\hp\\workspace\\desktop");
		if(f1.mkdirs())
		{
			System.out.println("folder is created");
		}
		else
		{
			System.out.println("folder is not created");
		}
	}

}
