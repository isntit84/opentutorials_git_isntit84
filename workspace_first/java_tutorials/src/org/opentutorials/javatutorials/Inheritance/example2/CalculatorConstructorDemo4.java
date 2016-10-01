package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator {
	int left, right;
	
	public Calculator() {}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class MultiplicationableCalculator extends Calculator {
	public MultiplicationableCalculator(int left, int right) {
		super (left, right);
 }

	public void Multiplication() {
    	System.out.println(this.left * this.right);
	}
}

public class CalculatorConstructorDemo4 {
	
	public static void main(String[] args) {
	 
		MultiplicationableCalculator c1 = new MultiplicationableCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.Multiplication();
	}

}