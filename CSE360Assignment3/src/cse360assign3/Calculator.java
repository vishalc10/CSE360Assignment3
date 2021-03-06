package cse360assign3;

/** 
 * Class Calculator to practice test driven development, using JUnit and GitHub
 * @author Vishal Chilka Pin[215]
 * @version Feb 21, 2016
 * 
 */

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Constructor method make total equals '0'
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Method to get the total of integers after performing operations
	 * @return 0
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Method to add parameter to the total variable
	 * @param value variable to be added to total variable
	 */
	public void add (int value) {
		
		history = history + " + " + value;
		total = total + value;
		
	}
	
	/**
	 * Method to subtract parameter from the total variable
	 * @param value variable to be subtracted from the total variable
	 */
	public void subtract (int value) {
		
		history = history + " - " + value;
		total = total - value;
	}
	
	/**
	 * Method to multiply parameter to the total variable
	 * @param value variable to be multiplied to the total variable
	 */
	public void multiply (int value) {
		
		history = history + " * " + value;
		total = total * value;
		
	}
	
	/**
	 * Method to divide the total variable by parameter
	 * @param value to divide the total variable
	 */
	public void divide (int value) {
		
		history = history + " / " + value;
		if(value == 0)
			total = 0;
		else
			total = total / value;
		
	}
	/**
	 * Method to return history of all actions as a string
	 * @return history of all actions as a string
	 */
	public String getHistory () {
		return history;
	}
}