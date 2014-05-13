public class Coin implements State {

	transient GumballMachine gumball;

	Coin(GumballMachine g) {
		this.gumball = g;
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning Crank");
		gumball.setState(gumball.getDispense());
	}

	@Override
	public void enterCoin() {
		System.out.println("Already has a coin");
	}

	@Override
	public void ejectCoin() {
		System.out.println("Fine, take your money back!");
		gumball.setState(gumball.getNoCoin());
	}

	@Override
	public void dispense() {
		System.out.println("You must turn the crank before dispensing!");
	}

	public String toString() {
		return "Coin";

	}
}
