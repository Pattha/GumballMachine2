
public class SoldOutState implements State {
    GumballMachine gumballMachine;
    
    public SoldOutState(GumballMachine gumballMachine){
    	this.gumballMachine = gumballMachine;
    }
	
	public void insertQuarter() {
		System.out.println("You can't insert, the machine is sold out");
	}

	public void ejectQuarter() {
		System.out.println("You can't eject, you hacen't inserted a quarter yet");

	}

	public void turnCrank() {
		System.out.println("You turned,but there are no gumballs");

	}

	public void dispense() {
		System.out.println("No gumball dispensed");

	}

}