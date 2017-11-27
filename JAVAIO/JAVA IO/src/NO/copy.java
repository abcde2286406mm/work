package NO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class copy {
	public static void main(String[] args) throws IOException{
	File scr = new File ("scr.txt");
	File dest = new File ("dest.txt");
	Scanner sc = new Scanner (System.in);
	String str = sc.nextLine();
	FileWriter scrout = new FileWriter(scr);
	FileWriter destout = new FileWriter(dest);
	FileReader scrin = new FileReader(scr);
	FileReader destin = new FileReader(dest);
	scrout.write(str);
	scrout.close();
	int ch = 0;
	System.out.println(ch);
	while((ch = scrin.read()) != -1 ) {
		destout.write(ch);
	}
	destout.close();
	scrin.close();
	destin.close();
}
}


