import java.util.ArrayList;
import java.util.Arrays;

//Fatih Akgündüz 150117032

public class SmartHome {
	
	private ArrayList<SmartObject> smartObjectList;
	
	public SmartHome() {
		smartObjectList=new ArrayList<SmartObject>();
	}
	
	public boolean addSmartObject(SmartObject smartObject) {
		System.out.println("Adding new SmartObject\n");
		smartObjectList.add(smartObject);
		smartObject.connect("10.0.0."+(99+smartObjectList.size()));
		smartObject.testObject();
		System.out.println("\n");
		
		return true;
	}
	
	public boolean removeSmartObject(SmartObject smartObject) {
		smartObjectList.remove(smartObject);
		return true;
	}
	
	public void controlLocation(boolean onCome) {
		System.out.println("LocationControl : OnCome\n");
		for(int x=0;x<smartObjectList.size();x++) {
			if(smartObjectList.get(x) instanceof LocationControl) {
				if (onCome)
					((LocationControl) smartObjectList.get(x)).onCome();
				else
					((LocationControl) smartObjectList.get(x)).onLeave();			}
		}
		System.out.println("\n");
	}
	
	public void controlMotion(boolean hasMotion, boolean isDay) {
		System.out.println("Motion Control : HasMotion, isDay\n");
		for(int x=0;x<smartObjectList.size();x++) {
			if(smartObjectList.get(x) instanceof MotionControl) {
				((MotionControl) smartObjectList.get(x)).controlMotion(hasMotion,isDay);	
				}
		}
			System.out.println("\n");
	}
	
	public void controlProgrammable() {
		System.out.println("Programmable : runProgram\n");
		for(int x=0;x<smartObjectList.size();x++) {
			if(smartObjectList.get(x) instanceof Programmable) {
				((Programmable) smartObjectList.get(x)).runProgram();	
				}
		}
		System.out.println("\n");
	}
	
	public void controlTimer(int seconds) {
		System.out.println("Programmable : runProgram\n");
		for(int x=0;x<smartObjectList.size();x++) {
			if(smartObjectList.get(x) instanceof Programmable) {
				if(seconds>0)
				( (Programmable) smartObjectList.get(x)).setTimer(seconds);	
				else
					( (Programmable) smartObjectList.get(x)).cancelTimer();
				}
		}
		System.out.println("\n");
	}
	
	public void controlTimerRandomly() {
		System.out.println("Programmable : Timer = 5 or 10 seconds randomly\n");
		
		int[] a= {0,5,10};
		
		for(int x=0;x<smartObjectList.size();x++) {
			if(smartObjectList.get(x) instanceof Programmable) {
				
			int r=(int) (Math.random()*3);
				if(a[r]==5||a[r]==10)
				( (Programmable) smartObjectList.get(x)).setTimer(a[r]);	
				else
					( (Programmable) smartObjectList.get(x)).cancelTimer();
				}
		}
		System.out.println("\n");
	}
	
	public void sortCameras() {
		System.out.println("Sort Smart Cameras\n");
		ArrayList<SmartCamera> list=new ArrayList<SmartCamera>();
		for(int x=0;x<smartObjectList.size();x++) {
			if(smartObjectList.get(x) instanceof Comparable) {
				list.add((SmartCamera) smartObjectList.get(x));
				}
		}
		SmartCamera[] cam= new SmartCamera[list.size()];
		
		for(int x=0;x<list.size();x++) {
			cam[x]=list.get(x);
		}
		Arrays.sort(cam);
		
		for(SmartCamera e: cam) {
			System.out.println(e);
		}
		System.out.println("\n");
	}

	public ArrayList<SmartObject> getSmartObjectList() {
		return smartObjectList;
	}

	public void setSmartObjectList(ArrayList<SmartObject> smartObjectList) {
		this.smartObjectList = smartObjectList;
	}
	
	
}
