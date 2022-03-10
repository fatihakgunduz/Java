
//Fatih Akgündüz 150117032

public class SmartCamera extends SmartObject implements MotionControl, Comparable<SmartCamera>{
	
	private boolean status;
	private int batteryLife;
	private boolean nightVision;
	
	public SmartCamera(String alias, String macId, boolean nightVision, int batteryLife) {
		super.setAlias(alias);
		super.setMacId(macId);
		this.nightVision=nightVision;
		this.batteryLife=batteryLife;
	}
	
	public void recordOn(boolean isDay) {
		if(isDay==false&&nightVision==false)
			System.out.println("Sorry! Smart Camera - "+super.getAlias()+" does not have night vision feature");
		else if(status==true)
			System.out.println("Smart Camera - "+super.getAlias()+" has been already turned on");
		else if(status==false) {
			status=true;
			System.out.println("Smart Camera - "+super.getAlias()+" is turned on now");
			}
		
	}
	
	public void recordOff() {
		
		if(status==false) 
			System.out.println("Smart Camera - "+super.getAlias()+" has been already turned off");
		else {
			status=false;
			System.out.println("Smart Camera - "+super.getAlias()+" is turned off now");
		}
	}
	
	@Override
	public boolean testObject() {
		System.out.println("Test is starting for SmartCamera");
		if(super.isConnectionStatus()) {
			super.SmartObjectToString();
			System.out.println("Test is starting for SmartCamera day time");
			recordOn(true);
			recordOff();
			System.out.println("Test is starting for SmartCamera night time");
			recordOn(false);
			recordOff();
			System.out.println("Test completed for SmartCamera");
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean shutDownObject() {
		if(status==true) {
			super.SmartObjectToString();
			return status=false;
		}
		else
		return false;
	}
	
	@Override
	public boolean controlMotion(boolean hasMotion, boolean isDay) {
		if (hasMotion==true)
			System.out.println("Motion detected!");
		else
			System.out.println("Motion not detected!");
		if(isDay==true) {
			recordOn(isDay);
			return true;
		}
		else {
			recordOn(isDay);
			return true;
		 }
	}

	@Override
	public int compareTo(SmartCamera smartCamera) {
		if(batteryLife>smartCamera.batteryLife)
			return 1;
		else if (batteryLife==smartCamera.batteryLife)
			return 0;
		else
			return -1;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public boolean isNightVision() {
		return nightVision;
	}

	public void setNightVision(boolean nightVision) {
		this.nightVision = nightVision;
	}

	public String toString() {
		return "SmartCamera -> " + super.getAlias() + "'s battery life is " + batteryLife + "status is recording";
	}
	
	

	
	
}
