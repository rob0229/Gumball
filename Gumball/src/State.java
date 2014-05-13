import java.io.*;


public interface State extends Serializable{
	void turnCrank();
	void enterCoin();
	void ejectCoin();
	void dispense();
	
}
