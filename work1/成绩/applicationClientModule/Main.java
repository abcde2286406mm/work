import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int i=0;
		int a[]=new int[100];
		System.out.println("��������Ҫת���ķ���������-1��������");
		for(i=0; i<100; i++){
			a[i]=sc.nextInt();
			if(a[i]==-1){
				break;
			}
			else if(a[i]>100){
				System.out.println("���������������");
				i=i-1;
			}
		}
		for(int j=0; j<=i; j++){
			if(a[j]>=90 && a[j]<=100){
				System.out.println("��");
			}
			else if(a[j]>=80 && a[j]<=89){
				System.out.println("��");
			}
			else if(a[j]>=70 && a[j]<=79){
				System.out.println("��");
			}
			else if(a[j]>=60 && a[j]<=69){
				System.out.println("����");
			}
			else if(a[j]>=0 && a[j]<=59){
				System.out.println("������");
			}
			else if(a[j]==-1){
				
			}
		}
	}

}