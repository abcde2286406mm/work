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
		System.out.println("该目录下对象个数："+tempList.length);
		for (int i = 0; i < tempList.length; i++) {		   
			   if (tempList[i].isDirectory()) {
			    System.out.println("文件夹："+tempList[i]+"修改日期："+tempList[i].lastModified()+"文件大小："+tempList[i].length());
			   }
			  }
		for (int i = 0; i < tempList.length; i++) {   
			  if (tempList[i].isFile()) {
				 System.out.println("文     件："+tempList[i]+"修改日期："+tempList[i].lastModified());
			   }
			  }
	}

}
