public class Empty implements State {
	transient GumballMachine gumball;

	Empty(GumballMachine g) {
		this.gumball = g;
	}

	@Override
	public void turnCrank() {
		System.out.println("Out of gumballs");
	}

	@Override
	public void enterCoin() {
		System.out.println("Out of gumballs");

	}

	@Override
	public void ejectCoin() {
		System.out.println("Out of gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("Out of gumballs");

	}

	public String toString() {
		return "Empty";

	}

}
