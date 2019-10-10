package cse360assign2;
/**
 * Represents a machine used for adding and subtracting.
 * A total integer can be continuously added to or subtracted from. 
 */
public class AddingMachine {

	 /**
	   * The integer to be added to and subtracted from and the string to record operations.
	   */
	private int total;
	private String record = "0";
	
	/**
	   * Creates a new machine and initializes total to 0.
	   */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	   * Gets the current total of adding/subtracting.
	   * @return the running total.
	   */
	public int getTotal () {
		return total;
	}
	
	/**
	   * Adds value to the total.
	   * @param value The value to be added to total.  
	   */
	public void add (int value) {
		total = value + total;
		record = record + " + " + Integer.toString(value);
	}
	
	/**
	   * Subtracts value from the total.
	   * @param value The value to be subtracted from the total.   
	   */
	public void subtract (int value) {
		total = total - value;
		record = record + " - " + Integer.toString(value);
	}
	
	 /**
	   * Gets the string that records the operations.
	   * @return the string of past operations.
	   */
	public String toString () {
		return record;
	}

	 /**
	   * Clears the total and the past record of operations. 
	   */
	public void clear() {
		total = 0;
		record = "0";
	}
}
