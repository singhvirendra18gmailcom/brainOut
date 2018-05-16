package org.threads.callableTest;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Status>{

	@Override
	public Status call() throws Exception {
		System.out.println("calling job");
		return new Status("101", "Success");
	}
	

}
