import java.text.SimpleDateFormat;

import java.util.Calendar;
//Fatih Akgündüz 150117032

public class SmartLight extends SmartObject implements LocationControl, Programmable {
	
	private boolean hasLightTurned;
	private Calendar programTime;
	private boolean programAction;
	
	public SmartLight(String alias, String macId) {
		super.setAlias(alias);
		super.setMacId(macId);
		this.programTime=Calendar.getInstance();
	}
	
	public void turnOnLight() {
		
		if(hasLightTurned==true)
			System.out.println("Smart Light - "+super.getAlias()+" has been already turned on");
			else {
			this.hasLightTurned=true;
			System.out.println("Smart Light - "+super.getAlias()+" is turned on now (Current Time: "+new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
		}
	}
	
	public void turnOffLight() {
		if(hasLightTurned==false)
			System.out.println("Smart Light - "+super.getAlias()+" has been already turned off");
			else {
			hasLightTurned=false;
			System.out.println("Smart Light - "+super.getAlias()+" is turned off now (Current Time: "+new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
		}
	}
	
	@Override
	public boolean testObject() {
		System.out.println("Test is starting for SmartLight");
		if(super.isConnectionStatus()) {
			super.SmartObjectToString();
			turnOnLight();
			turnOffLight();
			System.out.println("Test completed for SmartLight");
			return true;
		}
			else
		return false;
	}

	@Override
	public boolean shutDownObject() {
		
		if(hasLightTurned==true) {
		super.SmartObjectToString();
		return hasLightTurned=false;
		}
		else
			return false;
		
	}
	
	@Override
	public void onLeave() {

		if(hasLightTurned==true)
			this.hasLightTurned=false;
		System.out.println("On Come -> Smart Light - "+super.getAlias());		
		System.out.println("Smart Light - "+super.getAlias()+" is turned on now (Current Time: "+ new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
	
	}

	@Override
	public void onCome() {
		if(hasLightTurned==false)
			this.hasLightTurned=true;
		
		System.out.println("On Come -> Smart Light - "+super.getAlias());		
		System.out.println("Smart Light - "+super.getAlias()+" is turned on now (Current Time: "+  new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
	
	}

	@Override
	public void setTimer(int seconds) {
		
		if(super.isConnectionStatus()) {

		if(hasLightTurned==true) {
			programAction=false;
			System.out.println("Smart Plug - "+super.getAlias()+" will be turned off "+seconds+" seconds later! (Current Time: "
		+new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
		}
		else {
			programAction=true;
			System.out.println("Smart Plug - "+super.getAlias()+" will be turned on "+seconds+" seconds later! (Current Time: "
					+new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
					}
		}
		programTime.getTime();
		programTime.add(Calendar.SECOND, seconds);
		
	}
	
	@Override
	public void cancelTimer() {
		//if(super.isConnectionStatus())
			//programTime=null;
		
	}

	@Override
	public void runProgram() {
		
		Calendar cal=Calendar.getInstance();
		
		if(cal.get(Calendar.SECOND)==(programTime.get(Calendar.SECOND))) {
			
		System.out.println("runProgram -> Smart Light - "+super.getAlias());
		if(super.isConnectionStatus()) {
				if(programAction)
				turnOnLight();
				 else 
					turnOffLight();
		}
		}
	}
	
	public boolean isHasLightTurned() {
		return hasLightTurned;
	}

	public void setHasLightTurned(boolean hasLightTurned) {
		this.hasLightTurned = hasLightTurned;
	}

	public java.util.Calendar getProgramTime() {
		return programTime;
	}

	public void setProgramTime(java.util.Calendar programTime) {
		this.programTime = programTime;
	}

	public boolean isProgramAction() {
		return programAction;
	}

	public void setProgramAction(boolean programAction) {
		this.programAction = programAction;
	}
	
	
	
	
}
