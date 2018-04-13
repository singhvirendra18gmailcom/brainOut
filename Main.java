package brainOut;

public class Main {

	public static void main(String[] args) {
	TvRemote remote1=TvRemote.get();	
	System.out.println("Remote id : "+remote1.hashCode());
	remote1.process("Channel #203");
	
	TvRemote remote2=TvRemote.get();	
	System.out.println("Remote id : "+remote2.hashCode());
	remote2.process("Channel #409");
	
	}
}
