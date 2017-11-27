package objSerialize.student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		LinkedList<Student> stus = new LinkedList<Student>();
		FileInputStream fin = new  FileInputStream("d:/list.txt");
		Scanner sc = new Scanner(fin);
		while(sc.hasNext()) {
			//input data
			stus.add(new Student(sc.nextLong(),sc.next(),sc.next()));
		}
		sc.close();
		Arrays.asList(stus);
		fin.close();
		Student st;
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		ObjectInputStream In = null;
		st = stus.get(1);
		try {
			fos = new FileOutputStream("d:/Student.bin");
			out = new ObjectOutputStream(fos);
			while(!stus.isEmpty()) {
				st = stus.removeFirst();
				out.writeObject(st);
			}
				out.close();
			In = new ObjectInputStream(new FileInputStream("d:/Student.bin"));
			while( (st = (Student) In.readObject())!=null){
				System.out.println(st);
			}
		}
			catch(EOFException e){  
				
			} catch (IOException ex) {
			   ex.printStackTrace();
			}
	
	}
}

