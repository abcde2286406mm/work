public class Main {
	public static void main(String[] args) {
		int i=1990,j=0;
		while(i<=2007){
			if(i%4==0){
				if(i%100!=0){
					System.out.print(i);
					j=j+1;
				}
			}
			else if(i%400==0){
				System.out.print(i);
				j=j+1;
			}
			i=i+1;
            if(j==2){
            	j=0;
            	System.out.println();
            }
		}
	}

}