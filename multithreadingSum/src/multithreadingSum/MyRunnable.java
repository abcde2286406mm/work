package multithreadingSum;


public class MyRunnable implements Runnable {

	private static int sum = 0;
	static Thread t1 = new Thread(new MyRunnable() {

        @Override
        public void run() {
        	for(int i = 0; i<=25; i++) {
        		sum += i;
        	}
            System.out.println("t1:"+sum);
        }
    });
	static Thread t2 = new Thread(new MyRunnable() {

        @Override
        public void run() {
        	try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	for(int i = 26; i<=50; i++) {
        		sum += i;
        	}
            System.out.println("t2:"+sum);
        }
    });
	static Thread t3 = new Thread(new MyRunnable() {

        @Override
        public void run() {
        	try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	for(int i = 51; i<=75; i++) {
        		sum += i;
        	}
            System.out.println("t3:"+sum);
        }
    });
	static Thread t4 = new Thread(new MyRunnable() {

        @Override
        public void run() {
        	try {
				t3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	for(int i = 76; i<=100; i++) {
        		sum += i;
        	}
            System.out.println("t4:"+sum);
        }
    });

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable m = new MyRunnable();
		Thread tA = new Thread(m);
		tA.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
