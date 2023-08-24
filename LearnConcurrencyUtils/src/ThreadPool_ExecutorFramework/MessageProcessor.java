package ThreadPool_ExecutorFramework;

public class MessageProcessor implements Runnable {
	private int message;
	
	public MessageProcessor(int message) {
		this.message=message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"[RECEVIED] MESSAGE= "+message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName()+"[Done] Processing Message= "+message);
	}

	private void respondToMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Cannot Process the messge "+message);
		}		
	}
}
