package org.threads.callableTest;

public class Status {

	private String id;
	private String status;
	
	public Status(String id, String status) {
		super();
		this.setId(id);
		this.setStatus(status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
