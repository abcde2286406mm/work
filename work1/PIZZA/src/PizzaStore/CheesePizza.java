package PizzaStore;

public class CheesePizza extends Pizza{
	public void prepare() {
		System.out.println("制作CheesePizza的材料");
	}
	public void bake() {
		System.out.println("正在烘焙CheesePizza");
	}
	public void cut() {
		System.out.println("正在切割CheesePizza");
	}
	public void box() {
		System.out.println("正在包装CheesePizza");
	}
}
