package org.threads.advance.executorFramework;

public class Patent extends IpApplication{

	
	
	@Override
	public void run() {
		super.run();
		System.out.println("processing patent");
		try {
			ProccessorFactory.getProcessor(IpType.PATENT).process();
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
