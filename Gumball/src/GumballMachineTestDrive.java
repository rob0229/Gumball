import java.rmi.Naming;


public class GumballMachineTestDrive {

	public static void main(String[] args) {
		
		if (args.length < 2){
			System.out.println("Invalid number of arguments");
			System.exit(1);
			
			
		}
		try{
		int count = Integer.parseInt(args[1]);
		
		GumballMachine gumballMachine;
		gumballMachine = new GumballMachine(args[0], count);
		
		
		GumballMonitor monitor = new GumballMonitor( gumballMachine);
		monitor.report();
		Naming.rebind("//"+args[0]+"/first", gumballMachine);
		System.out.println("Gets past");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
