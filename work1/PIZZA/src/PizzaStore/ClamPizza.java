package PizzaStore;

public class ClamPizza extends Pizza{
	public void prepare() {
		System.out.println("制作ClamPizza的材料");
	}
	public void bake() {
		System.out.println("正在烘焙ClamPizza");
	}
	public void cut() {
		System.out.println("正在切割ClamPizza");
	}
	public void box() {
		System.out.println("正在包装ClamPizza");
	}
}

