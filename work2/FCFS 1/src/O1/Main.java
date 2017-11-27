package O1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {
	void input()throws FileNotFoundException, IOException {
		Random random = new Random();
		int serviceTime[]= {6,2,1,3,9};
		int s;
		File filein = new File("d:/input.txt");
		int i=1;
		try {
				FileOutputStream out= new FileOutputStream(filein);
				PrintWriter pwr = new PrintWriter(out);
				for(; i<=170; i++) {
					s = random.nextInt(5);
					pwr.print(i+" "+(i-1)+" "+serviceTime[s]+"\r\n");
				}
				pwr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
			int get_min (int x, int y) {
			return (x>y)?y:x;
			}
	
	}


