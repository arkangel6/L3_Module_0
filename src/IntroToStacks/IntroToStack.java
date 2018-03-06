package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stak = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i< 100; i++) {
			Random rand = new Random();
			double x = rand.nextDouble()*100;
			stak.add(x);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		JOptionPane.showMessageDialog(null, "Enter 2 numbers between 0 and 100");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number between 0 and 100"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number between 0 and 100"));
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		
		for(int i = 0; i < stak.size(); i++) {
			
			if(num1< stak.get(i) && stak.get(i) < num2) {
				System.out.println(stak.pop());
			}
			else {
				stak.pop();
			}
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
