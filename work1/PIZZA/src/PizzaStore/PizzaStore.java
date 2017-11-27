package PizzaStore;

public class PizzaStore {
	private SimplePizzaFactory spf;
	PizzaStore(){
		spf=new SimplePizzaFactory();
		
	}
	public Pizza orderPizza(String st) {
		Pizza pz=spf.createPizza(st);
		return pz;
		
	}
}
