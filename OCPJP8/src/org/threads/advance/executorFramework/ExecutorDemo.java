package org.threads.advance.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		
		IpApplication[] ipApplications =new IpApplication[6];
		Trademark trademark1=new Trademark();
		Patent patent1=new Patent();
		Design design1 =new Design();
		Trademark trademark2=new Trademark();
		Patent patent2=new Patent();
		Design design2 =new Design();
		
		ipApplications[0]=trademark1;
		ipApplications[1]=trademark2;
		
		ipApplications[2]=patent1;
		ipApplications[3]=patent2;
		
		ipApplications[4]=design1;
		ipApplications[5]=design2;
		
	
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(IpApplication ipApplication:ipApplications) {
			service.submit(ipApplication);
		}
		service.shutdown();
		
				
	}
	
}

