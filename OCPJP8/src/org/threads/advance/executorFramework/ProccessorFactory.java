package org.threads.advance.executorFramework;

public class ProccessorFactory {

	public static IpProcessor getProcessor(IpType ipType) throws ResourceNotFoundException{
			IpProcessor processor;
		switch(ipType) {
			case TRADEMARK: 
				processor=new TrademarkProcessor();
				break;	
			case PATENT:
				processor=new PatentProcessor();
				break;
			case DESIGN:
				processor=new DesignProcessor();
				break;
			default:
				ResourceNotFoundException rnfe=new ResourceNotFoundException();
				throw rnfe;
		}
		return processor;
		
		
		
	}
}
