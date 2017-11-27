package normalIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
	public static void main(String[] args) throws IOException {
		long startTime=System.currentTimeMillis();
		int ch = 0;
		File inFile = new File("d:/input.txt");  
	    File outFile = new File("d:/put.txt");  
	    FileInputStream finS = new FileInputStream(inFile);  
	    FileOutputStream foutS = new FileOutputStream(outFile);  
	    while((ch = finS.read()) != -1 ) {
	    	foutS.write(ch);
		}
	    finS.close();
	    foutS.close();
	    long endTime=System.currentTimeMillis(); 
	    System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	}
}
