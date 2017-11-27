package PizzaStore;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		if(type.equals("CheesePizza")) {
			CheesePizza p1 = new CheesePizza();
			p1.prepare();
			
			return p1;
		}
//		else if(type == "Pepperoni") {
//			PepperoniPizza p2 = new PepperoniPizza();
//			return p2;
//		}
//		else if(type == "Clam") {
//			ClamPizza p3 = new ClamPizza();
//			return p3;
//		}
		else return null;
	}
}
