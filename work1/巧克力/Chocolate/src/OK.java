
public class OK {
	public static void main(String[] args){
		Chocolate C1= Chocolate.getInstance();
		Chocolate C2= Chocolate.getInstance();
		C1.fill();
		System.out.println(C1.Isboil());
		System.out.println(C2.Isempty());
		C2.fill();
		C2.boil();
		C1.boil();
		C1.drain();
		C2.drain();
	}
}
