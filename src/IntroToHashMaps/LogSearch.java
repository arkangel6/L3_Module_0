package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	public static void main(String[] args) {
		LogSearch ls = new LogSearch();
		ls.buildGUI();
	}
	
	JButton button, button2, button3, button4;
	JPanel panel;
	JFrame frame;
	public void buildGUI() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(300, 500);
		frame.add(panel);
		frame.setVisible(true);
		frame.setLayout(null);
		
		button = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)) {
			int key = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
			String name = JOptionPane.showInputDialog("Enter a name");
			log.put(key, name);
		}
		
		if(e.getSource().equals(button2)) {
			int key = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID"));
			if(log.containsKey(key)) {
			JOptionPane.showMessageDialog(null, log.get(key));
			}
			else {
				JOptionPane.showMessageDialog(null, "Entry does not exist");
				
			}
		}
		if(e.getSource().equals(button3)) {
			String total = " ";
			for(Integer key :log.keySet()) {
				total = total + "ID: " + key + "  Name: " + log.get(key);
				total = total + "\n";
			}
			JOptionPane.showMessageDialog(null, total);
		}
		if(e.getSource().equals(button4)) {
			int key = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID to remove"));
			if(log.containsKey(key)) {
					log.remove(key);
					JOptionPane.showMessageDialog(null, "Entry deleted");
			}
			else {
				JOptionPane.showMessageDialog(null, "Entry does not exist");
				
			}
		}
		
		
	}
}
