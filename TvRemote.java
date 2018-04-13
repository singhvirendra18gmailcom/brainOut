package brainOut;

/**
 * @author VIREN
 * 
 *         Singleton pattern using double checking locking and synchronized
 *         keyword so that , this class remain singleton in multi-threaded
 *         Environment. the synchronized block is used inside the if condition
 *         with an additional check to ensure that only one instance of
 *         singleton class is created
 */
public class TvRemote {

	private final String model;
	private final String tv;

	private static TvRemote tvRemote = null;

	private TvRemote() {
		this.model = "10x";
		this.tv = "Generic";

	}

	public static TvRemote get() {
		if (tvRemote == null)
			synchronized (TvRemote.class) {
				if (tvRemote == null) {
					tvRemote = new TvRemote();
				}
			}
		return tvRemote;

	}

	public void process(String operationName) {
		System.out.println("processng " + operationName + "... on " + tv);
		System.out.println(operationName + "processed on " + tv);
	}
}
