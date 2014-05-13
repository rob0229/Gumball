import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	private State state;
	private NoCoin noCoin;
	private Coin coin;
	private Empty empty;
	private Dispense dispense;
	private String location;

	int count;

	public GumballMachine(String location, int num) throws RemoteException{
		noCoin = new NoCoin(this);
		coin = new Coin(this);
		empty = new Empty(this);
		dispense = new Dispense(this);
		count = num;
		state = noCoin;
		this.location = location;
	}

	public int getCount() {
		return count;
	}

	public void setState(State s) {
		this.state = s;
	}

	public State getState() {
		return state;
	}

	public State getNoCoin() {

		return noCoin;
	}

	public State getCoin() {

		return coin;
	}

	public State getEmpty() {

		return empty;
	}

	public State getDispense() {

		return dispense;
	}

	public State getCurrentState() {
		return state;
	}

	public void turnCrank() {

		state.turnCrank();
	}

	public void enterCoin() {
		state.enterCoin();
	}

	public void ejectCoin() {
		state.ejectCoin();
	}

	public void dispense() {

		state.dispense();
	}

	public void refill(int num) {
		count = num;
	}

	public void releaseBall() {
		count--;

	}

	public String getLocation() {

		return location;
	}
}
