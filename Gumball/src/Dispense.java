public class Dispense implements State {
	transient GumballMachine gumball;

	Dispense(GumballMachine g) {
		this.gumball = g;
	}

	@Override
	public void turnCrank() {
		System.out.println("Already Dispensing");
	}

	@Override
	public void enterCoin() {
		System.out.println("Dispensing Now");
		gumball.setState(gumball.getCoin());
	}

	@Override
	public void ejectCoin() {
		System.out.println("Cannot eject coin while turning crank");
	}

	@Override
	public void dispense() {
		gumball.releaseBall();
		System.out.println("Dispensing gumball");
		if (gumball.getCount() > 0) {
			gumball.setState(gumball.getNoCoin());
		} else
			gumball.setState(gumball.getEmpty());

	}

	public String toString() {
		return "Dispense";

	}

}
