
public class NoCoin implements State{
	transient GumballMachine gumball;
	
	NoCoin(GumballMachine g){
		this.gumball = g;	
	}
	
	@Override
	public void turnCrank() {
		System.out.println("Cannot turn crank without a coin");	
	}

	@Override
	public void enterCoin() {
		System.out.println("Added a coin");
		gumball.setState(gumball.getCoin());	
	}

	@Override
	public void ejectCoin() {		
		System.out.println("There is no coin to eject!");
	}

	@Override
	public void dispense() {
		System.out.println("You cannot dispense withpout a coin");;		
	}
	
	public String toString(){
		return "NoCoin";
		
	}
	
}
