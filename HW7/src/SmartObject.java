
//Fatih Akgündüz 150117032

public abstract class SmartObject {
	private String alias;
	private String macId;
	private String IP;
	private boolean connectionStatus;

	
	public SmartObject() {
		
	}
	
	public boolean connect(String IP) {
		this.IP=IP;
		this.connectionStatus=true;
		System.out.println(alias+" connection established");
		
		return connectionStatus;
	}
	
	public boolean disconnect() {
		return this.connectionStatus=false;
	}

	public void SmartObjectToString() {
	
		System.out.println("This is " + this.getClass().getSimpleName() +" device "+alias+ "\n\tMacId : " + macId + "\n\tIP : " + IP);
	
	}	
	
	public boolean controlConnection() {
		
		if (connectionStatus==true)
			return true;
		else {
			System.out.println("This device is not connected. SmartObject ->"+alias);
			return false;
		}
			
		
	}
	
	public abstract boolean testObject();
	
	public abstract boolean shutDownObject();

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getMacId() {
		return macId;
	}

	public void setMacId(String macId) {
		this.macId = macId;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public boolean isConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(boolean connectionStatus) {
		this.connectionStatus = connectionStatus;
	}
	
	
}
