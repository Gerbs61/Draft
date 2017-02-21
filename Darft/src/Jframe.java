import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jframe extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		
		Object[] options = {"Axemen", "Puck", "Beaver"};
		className = JOptionPane.showOptionDialog(frame, "What team do you coach?",
				"Your time, effort, and glory",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "TIMBER!");
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "TD's at top cheddar!");
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "Dam the score go for broke!");
				break;
				}
			}
		final String[] genre = { "Pucks", "Beavers", "Axemen" };

			{
			final JFrame frame = new JFrame();
		    String team = (String) JOptionPane.showInputDialog(frame, 
		            "What Logo do you want coach",
		            "Logo",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            genre, 
		            genre[0]);
		    JOptionPane.showMessageDialog(frame, "no good eh ya hoser");


		      }
	    }
	}


