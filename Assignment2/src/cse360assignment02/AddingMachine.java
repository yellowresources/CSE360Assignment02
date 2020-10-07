package cse360assignment02;

public class AddingMachine {
  private int total;
  private String number;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
	  
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  number = " + " + value; 
  }

  public void subtract (int value) {
	  total = total - value;
	  number = " - " + value;
  }

  public String toString () {
	  
    return number;
  }

  public void clear() {
	  total = 0;
  }
}