package menuReading;
import java.io.File;
import java.util.*;
public class menuTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();
		File file = new File(path);
		File[] tempList = file.listFiles();
		Arrays.asList(tempList);
		System.out.println("��Ŀ¼�¶��������"+tempList.length);
		for (int i = 0; i < tempList.length; i++) {		   
			   if (tempList[i].isDirectory()) {
			    System.out.println("�ļ��У�"+tempList[i]+"�޸����ڣ�"+tempList[i].lastModified()+"�ļ���С��"+tempList[i].length());
			   }
			  }
		for (int i = 0; i < tempList.length; i++) {   
			  if (tempList[i].isFile()) {
				 System.out.println("��     ����"+tempList[i]+"�޸����ڣ�"+tempList[i].lastModified());
			   }
			  }
	}

}
