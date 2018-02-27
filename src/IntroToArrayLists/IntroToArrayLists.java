package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("hi");
		strings.add("hello");
		strings.add("hiadsfasd");
		strings.add("asdfeadsfas");
		strings.add("dadads");
		//3. Print all the Strings using a standard for-loop
		System.out.println("\n");
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("\n");
		for(String s : strings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("\n");
		for(int i = 0; i < strings.size(); i+=2) {
			System.out.println(strings.get(i));
		}
		//6. Print all the Strings in reverse order.
		System.out.println("\n");
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(strings.size()-i-1));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("\n");
		
			for(String s : strings) {
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
