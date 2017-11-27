import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char a[]=new char[7];
		for(int i=0; i<7; i++){
			a[i]=' ';
		}
		for(int i=3,j=3; i>=0 && j<=6; j++,i--){
			a[i]='*';
			a[j]='*';
			for(int g=0; g<7; g++){
				System.out.print(a[g]);
			}
			System.out.println();
		}
		for(int i=6,j=0; j<3 && i>3; i--,j++){
			a[i]=' ';
			a[j]=' ';
			for(int g=0; g<7; g++){
				System.out.print(a[g]);
			}
			System.out.println();
		}
	}
}