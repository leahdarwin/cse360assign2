package cse360assign2;

public class AddingMachine {

	private int total;
	private String record = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = value + total;
		record = record + " + " + Integer.toString(value);
	}
	
	public void subtract (int value) {
		total = total - value;
		record = record + " - " + Integer.toString(value);
	}
		
	public String toString () {
		return "";
	}

	public void clear() {
		total = 0;
		record = "0";
	}
}
