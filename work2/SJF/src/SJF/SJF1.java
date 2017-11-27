package SJF;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class SJF1 {
		public static void main(String[] agrs) throws IOException {
			INPUT P = new INPUT();
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
				System.out.println(textid[i]+" "+arrive_time[i]+" "+serve_time[i]);
			}
			for(; clock<170; clock++) {			
				start_time = finish_time;
				finish_time = start_time + serve_time[clock];
				System.out.println("textid:"+textid[clock]+" "+"arrive_time:"+arrive_time[clock]+" "+"serve_time:"+serve_time[clock]+" "+"start_time:"+start_time+" "+"finish_time"+finish_time+" "+"turnAround_time"+(finish_time-arrive_time[clock]));
				if(finish_time<170) {					
				    for(int m= clock+2; m<=finish_time; m++) {
				    	if(serve_time[clock+1]>serve_time[m]) {
				    		int n=0;
				    		n=textid[clock+1];
				    		textid[clock+1]=textid[m];
				    		textid[m]=n;
				    		
				    		n=arrive_time[clock+1];
				    		arrive_time[clock+1]=arrive_time[m];
				    		arrive_time[m]=n;
				    		
				    		n=serve_time[clock+1];
				    		serve_time[clock+1]=serve_time[m];
				    		serve_time[m]=n;
				    	}
					}
				}
				else if(finish_time>=170) {
					for(int m= clock+2; m<170; m++) {
				    	if(serve_time[clock+1]>serve_time[m]) {
				    		int n=0;
				    		n=textid[clock+1];
				    		textid[clock+1]=textid[m];
				    		textid[m]=n;
				    		
				    		n=arrive_time[clock+1];
				    		arrive_time[clock+1]=arrive_time[m];
				    		arrive_time[m]=n;
				    		
				    		n=serve_time[clock+1];
				    		serve_time[clock+1]=serve_time[m];
				    		serve_time[m]=n;
				    	}					
					}
				}
			}	
		}
}
