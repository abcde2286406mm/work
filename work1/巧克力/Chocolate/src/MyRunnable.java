
public class MyRunnable implements Runnable {
	
	private static Chocolate uniqueInstance;
	
	public static Chocolate getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Chocolate();
		}
		return uniqueInstance;
	}
	
	
	public static void main(String[] args) { 
        MyRunnable r = new MyRunnable(); 
       
        Thread ta = new Thread(r, "Thread-A"); 
        Thread tb = new Thread(r, "Thread-B"); 
        ta.start(); 
        tb.start(); 
    }
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub		
	 synchronized (this) {
		Chocolate C1= this.getInstance();
		try {
			Thread.sleep(1000);
			C1.fill();


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	}
}
