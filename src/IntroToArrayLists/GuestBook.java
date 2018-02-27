package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		
		GuestBook gb = new GuestBook();
		gb.buildGUI();
		
		
	}
	JButton button, button2;
	JPanel panel;
	JFrame frame;
	JTextField t;
	JTextArea text;
	public void buildGUI() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(300, 500);
		frame.add(panel);
		frame.setVisible(true);
		frame.setLayout(null);
		
		button = new JButton();
		button2 = new JButton();
		panel.add(button);
		panel.add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.setText("Add Name");
		button2.setText("View Name");
		button.addActionListener(this);
		button2.addActionListener(this);
		
		text = new JTextArea("hi");
		text.setBounds(0, 30, 200, 200);
		
		panel.add(text);
		panel.setLayout(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(button)) {
			String name = JOptionPane.showInputDialog("Add a name");
			names.add(name);
		}
		
		if(e.getSource().equals(button2)) {
			
			String output = "";
			for(String name: names) {
				output += name +"\n";
				
			}
			text.setText(output);
			System.out.println(output);
			
			
		}
		
		
	}
	
}
