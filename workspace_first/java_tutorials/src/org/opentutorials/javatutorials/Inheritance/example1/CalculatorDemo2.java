package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends SubstractionableCalculator {

	public void Multiplication() {
    	System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {
	
	public static void main(String[] args) {
	 
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.Multiplication();
	}

}
