package IntroToStacks;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	Stack<String> stak = new Stack<String>();
	Stack<String> stakFinal = new Stack<String>();
	public static void main(String[] args) {
		TextUndoRedo t = new TextUndoRedo();
		t.buildGUI();
		
		
	}
	int index = 0;
	String text = "";
	JPanel panel;
	JFrame frame;
	JLabel label;
	public void buildGUI() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(300, 500);
		frame.add(panel);
		frame.setVisible(true);
		frame.setLayout(null);
		label = new JLabel();
		panel.add(label);
		frame.addKeyListener(this);
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			if(!stak.isEmpty()) {
			
			//label.setText(text);
			//index--;
			}
		}
		else {
			
			stak.push(""+e.getKeyChar());
			text = text + stak.get(index);
			label.setText(text);
			index++;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}