import java.rmi.RemoteException;


public class GumballMonitor {
	GumballMachineRemote machine;
	
	public GumballMonitor (GumballMachineRemote g){
		this.machine=g;
		
	}
	public void report(){
		try{
		System.out.println("Current State is : "+ machine.getState());
		System.out.println("Current count is : "+ machine.getCount());
		System.out.println("Machine Location is : "+ machine.getLocation());
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
}