import java.text.SimpleDateFormat;
import java.util.Calendar;

//Fatih Akgündüz 150117032

public class SmartPlug extends SmartObject implements Programmable{
	
	private boolean status;
	private Calendar programTime;
	private boolean programAction;
	
	public SmartPlug(String alias, String macId) {
		super.setAlias(alias);
		super.setMacId(macId);
		programTime=Calendar.getInstance();
	}
	
	public void turnOn() {
		
		if (status==false) {
			 this.status=true;
			 System.out.println("Smart Plug - "+super.getAlias()+" is turned on now (Current Time: "+ new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
		}
		else
			 System.out.println("Smart Plug - "+super.getAlias()+" is already turned on");
		
	}
	
	public void turnOff() {
		if (status==true) {
			 this.status=false;
			 System.out.println("Smart Plug - "+super.getAlias()+" is turned off now (Current Time: "+ new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis())+")");
		}
		else
			 System.out.println("Smart Plug - "+super.getAlias()+" is already turned off");
		
	}
	
	@Override
	public boolean testObject() {
		System.out.println("Test is starting for SmartPlug");
		if(super.isConnectionStatus()) {
			super.SmartObjectToString();
			turnOn();
			turnOff();
			System.out.println("Test completed for SmartPlug");
			return true;
		}
			else
		return false;
	}

	@Override
	public boolean shutDownObject() {
		if(status==true) {
			super.SmartObjectToString();
			return this.status=false;
			}
			else
				return false;
		} 

	@Override
	public void setTimer(int seconds) {
		
		if(super.isConnectionStatus()) {
	
		if(status==true) {
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
		
		
	}

	@Override
	public void runProgram() {
		Calendar cal=Calendar.getInstance();
		
		if(cal.get(Calendar.SECOND)==(programTime.get(Calendar.SECOND))) {
			
		System.out.println("runProgram -> Smart Plug - "+super.getAlias());
		if(super.isConnectionStatus()) {
				if(programAction)
				turnOn();
				 else 
					turnOff();
		}
		}
				
		
		
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
