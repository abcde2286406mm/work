
public class Main {
	public static void main(String[] args) {
		int i=100;
		for(; i<=999; i++){
			int a=i/100;
			int b=(i%100)/10;
			int c=(i%100)%10;
			if((a*a*a)+(b*b*b)+(c*c*c)==i){
				System.out.println(i);
			}
		}
	}

}