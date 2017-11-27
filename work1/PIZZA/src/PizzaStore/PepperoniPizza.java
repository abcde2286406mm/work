package PizzaStore;

public class PepperoniPizza extends Pizza{
	public void prepare() {
		System.out.println("制作PepperoniPizza的材料");
	}
	public void bake() {
		System.out.println("正在烘焙PepperoniPizza");
	}
	public void cut() {
		System.out.println("正在切割PepperoniPizza");
	}
	public void box() {
		System.out.println("正在包装PepperoniPizza");
	}
}
