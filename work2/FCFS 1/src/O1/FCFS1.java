package O1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;




public class FCFS1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Main P = new Main();
		P.input();
		File fileout = new File("d:/input.txt");
		Scanner read = new Scanner(new FileInputStream(fileout));
		int textid[]= new int[300];
		int arrive_time[]= new int[300];
		int serve_time[]= new int[300];
		int start_time=0;
		int finish_time = 0;
		int clock=0;
		for (int i=0; i<170; i++){
			textid[i]=read.nextInt();
			arrive_time[i]=read.nextInt();
			serve_time[i]=read.nextInt();
		}
		for(; clock<170; clock++) {			
			start_time = finish_time;
			finish_time = start_time + serve_time[clock];
			System.out.println("textid:"+textid[clock]+" "+"arrive_time:"+arrive_time[clock]+" "+"serve_time:"+serve_time[clock]+" "+"start_time:"+start_time+" "+"finish_time"+finish_time+" "+"turnAround_time"+(finish_time-arrive_time[clock]));
		}
	}
}
