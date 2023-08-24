package ThreadPool_ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;

public class ThreadpoolDemo {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		Runnable processor =new MessageProcessor(2);
		executor.execute(processor);
		
		Runnable processor2 =new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 =new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 =new MessageProcessor(5);
		executor.execute(processor4);

		
		executor.shutdown();
//		try {
//			executor.awaitTermination(2, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Submitted all tasks");
	}

}