package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * Class Calculator to practice test driven development, using JUnit and GitHub
 * @author Vishal Chilka Pin[215]
 * @version Feb 21, 2016
 * 
 */

/* Class to test the working of Calculator.java */
public class CalculatorTest {

	/* Test method for default Constructor */
	@Test
	public void testCalculator() {
		
		Calculator myCalculator = new Calculator();
		assertNotNull("Object doesn't return a null", myCalculator);
	}

	/* Test method for correct total */
	@Test
	public void testGetTotal() {
		
		Calculator myCalculator = new Calculator();
		assertEquals("getTotal method returns 0", myCalculator.getTotal(),0);
				
	}

	/* Test method for addition */
	@Test
	public void testAdd() {
		
		Calculator myCal1 = new Calculator();
		myCal1.add(10);
		assertEquals("Add method adds 10", myCal1.getTotal(), 10);
		
	}

	/* Test method for subtraction */
	@Test
	public void testSubtract() {
		
		Calculator myCal2 = new Calculator();
		myCal2.add(10);
		myCal2.subtract(3);
		assertEquals("Add method subtracts 10", myCal2.getTotal(), 7);
		
	}

	/* Test method for multiplication */
	@Test
	public void testMultiply() {
		
		Calculator myCal3 = new Calculator();
		myCal3.add(10);
		myCal3.multiply(2);
		assertEquals("Add method adds 10", myCal3.getTotal(), 20);
		
	}

	/* Test method for division */
	@Test
	public void testDivide() {
		
		Calculator myCal4 = new Calculator();
		myCal4.add(10);
		myCal4.divide(5);
		assertEquals("Add method adds 10", myCal4.getTotal(), 2);
		myCal4.divide(0);
		assertEquals("Add method adds 10", myCal4.getTotal(), 0);
		
	}

	/* Test method for getting history of operations */
	@Test
	public void testGetHistory() {
		Calculator myCal5 = new Calculator();
		myCal5.add(10);
		assertSame(myCal5.getHistory(), "");
		
	}

}
