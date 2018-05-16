package org.threads.callableTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service=Executors.newFixedThreadPool(2);
		MyCallable  callable=new MyCallable();
		Future<Status> t=service.submit(callable);
		System.out.println(t.get().getId());
		System.out.println(t.get().getStatus());
		service.shutdown();
		
		
	}

}
