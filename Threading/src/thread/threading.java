package thread;

public class threading {
	public static void main(String[] args) {
		System.out.println("Starting thread1");
//		Task taskRunner=new Task("Thread-A");
//		Thread t1=new Thread(new Task("Thread-A"));
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
//				Thread.currentThread().setName(this.Name);
				for(int i=0;i<1000;i++) {
					System.out.println("number:"+ i+ "-" + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		
		System.out.println("Starting thread2");
//		Task tr2=new Task("Thread-B");
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
//				Thread.currentThread().setName(this.Name);
				for(int i=0;i<1000;i++) {
					System.out.println("number:"+ i+ "-" + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t2.start();

	}
}	
class Task implements Runnable{
	String Name;
	
	public Task(String Name) {
		this.Name=Name;
	}
	public void run() {
		Thread.currentThread().setName(this.Name);
		for(int i=0;i<1000;i++) {
			System.out.println("number:"+ i+ "-" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}