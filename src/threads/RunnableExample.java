//package threads_runnable;
//
package threads;
//
//
//import threads.MyThread;

import threads.MyThred;



class MyThred implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState() + " - " + i);

			try {
				Thread.sleep(400); /* Thread sleeps for 400 milliseconds*/
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Exiting: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());

		
	}
	
	
}
	


public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());

		MyThread r1 = new MyThread();
		MyThread t1 = new Thread(r1, "T-1");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Running: " + t1.getName() + " - " + t1.getState());
		
		MyThread r2 = new MyThread();
		MyThread t2 = new Thread(r2,"T-2");
		
		t2.setPriority(Thread.MAX_PRIORITY);


		System.out.println("Running: " + t2.getName() + " - " + t2.getState());		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		//t1.run(); //will not work if method is not created
//		
//		try {
//			t1.join();
//			t2.join();
//
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Ending: " + t1.getName() + " - " + t1.getState());
		System.out.println("Ending: " + t2.getName() + " - " + t2.getState());

		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());


	}

}
