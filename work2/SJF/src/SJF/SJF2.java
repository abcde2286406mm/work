package SJF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SJF2 {
	public static void main(String[] args) throws IOException {
		INPUT P = new INPUT();
		P.input();
		File fileout = new File("d:/input.txt");
		Scanner read = new Scanner(new FileInputStream(fileout));
		int textid[]= new int[300];
		int arrive_time[]= new int[300];
		int serve_time[]= new int[300];
		boolean judge1= true;
		boolean judge2= true;
		int start_time1=0;
		int start_time2=0;
		int finish_time1 = 0;
		int finish_time2 = 0;
		
		int clock=0;
		for (int i=0; i<170; i++){
			textid[i]=read.nextInt();
			arrive_time[i]=read.nextInt();
			serve_time[i]=read.nextInt();
			System.out.println(textid[i]+" "+arrive_time[i]+" "+serve_time[i]);
		}
		for(; clock<170; clock++) {	
			
			if(finish_time1 == finish_time2) {judge1 = true; judge2 = true;}
			else if (finish_time1>finish_time2) {judge2=true;}
			else {judge1=true;}
			
			if(judge1==true ) {	
			judge1 = false;
			start_time1 = finish_time1;
			finish_time1 = start_time1 + serve_time[clock];
			System.out.println("serve in line 1  "+"textid:"+textid[clock]+" "+"arrive_time:"+arrive_time[clock]+" "+"serve_time:"+serve_time[clock]+" "+"start_time:"+start_time1+" "+"finish_time"+finish_time1+" "+"turnAround_time"+(finish_time1-arrive_time[clock]));
			if(finish_time1<170) {					
			    for(int m= clock+2; m<=finish_time1; m++) {
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
			else if(finish_time1>=170) {
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
			else if(judge2==true ) {	
				judge2 = false;
				start_time2 = finish_time2;
				finish_time2 = start_time2 + serve_time[clock];
				System.out.println("serve in line 2  "+"textid:"+textid[clock]+" "+"arrive_time:"+arrive_time[clock]+" "+"serve_time:"+serve_time[clock]+" "+"start_time:"+start_time2+" "+"finish_time"+finish_time2+" "+"turnAround_time"+(finish_time2-arrive_time[clock]));
				if(finish_time2<170) {					
				    for(int m= clock+2; m<=finish_time2; m++) {
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
				else if(finish_time2>=170) {
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
}
