
import java.awt.Canvas;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Component;
import java. awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Draft extends Jframe
	{
		static int randomNumber;
		static int number = 1;
		static int score;
		static String confirm;
		static ArrayList<Team> roster = new ArrayList<Team>();
		static ArrayList<Team> myRoster = new ArrayList<Team>();
		public static void main(String[] args)
			{
			jayFrame();
			welcomeCoach();
			fillRoster();
			myTeam();
			myScore();
			}
				{
		  			Draft canvas = new Draft();
			        JFrame frame = new JFrame();
			        frame.setSize(900, 900);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.black);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
		    	}
			public static void jayFrame()
			{
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
					            "Which logo would you like out of the three teams?",
					            "Logo",
					            JOptionPane.QUESTION_MESSAGE, 
					            null, 
					            genre, 
					            genre[0]);
					    JOptionPane.showMessageDialog(frame, "alrighty then ya hoser");


					      }
				    }
			}
			public void paint(Graphics graphics) 
			{
			 graphics.setColor(Color.white);
			 graphics.fillRect(47, 247, 700, 200);
			 
			 graphics.setColor(Color.red);
			 graphics.fillOval(47, 247, 500, 200);
			 
			 graphics.setColor(Color.white);
			 graphics.fillOval(100, 247, 500, 200);
			 
			 graphics.setColor(Color.red);
			 graphics.fillRect(400, 247, 40, 200);
			 
			 graphics.setColor(Color.red);
			 graphics.fillRect(400, 247, 200, 40);
			 
			 graphics.setColor(Color.red);
			 graphics.fillRect(400, 300, 200, 40);
			 
			}
			public void paint1(Graphics graphics)
			{
				//Beaverlogo
				 graphics.setColor(Color.white);
				 graphics.fillRect(47, 247, 700, 200);
				 
				 graphics.setColor(Color.blue);
				 graphics.fillRect(400, 247, 40, 200);
						 
				 graphics.setColor(Color.blue);
				 graphics.fillOval(400, 240, 200, 125);
						 
				 graphics.setColor(Color.blue);
				 graphics.fillOval(400, 343, 200, 125);	
				 
				 graphics.setColor(Color.white);
				 graphics.fillOval(450, 260, 125, 75);
						 
				 graphics.setColor(Color.white);
				 graphics.fillOval(450, 370, 125, 75);	
			}
			public void paint11(Graphics graphics)
			{
				//puckslogo
				 graphics.setColor(Color.white);
				 graphics.fillRect(47, 247, 700, 200);
				 
				 graphics.setColor(Color.black);
				 graphics.fillOval(47, 247, 200, 200);
				 
				 graphics.setColor(Color.yellow);
				 graphics.fillRect(400, 247, 40, 400);
				 
				 graphics.setColor(Color.yellow);
				 graphics.fillRect(400, 247, 200, 40);
				 
				 graphics.setColor(Color.yellow);
				 graphics.fillRect(400, 375, 200, 40);
				 
				 graphics.setColor(Color.yellow);
				 graphics.fillRect(570, 246, 40, 169);
			}
			public void paint111(Graphics graphics)
			{
				//axemenlogo
				 graphics.setColor(Color.white);
				 graphics.fillRect(47, 247, 700, 200);
				 
				 graphics.setColor(Color.green);
				 graphics.fillRect(400, 247, 40, 200);
				 
				 graphics.setColor(Color.green);
				 graphics.fillRect(400, 247, 200, 40);
				 
				 graphics.setColor(Color.green);
				 graphics.fillRect(400, 375, 200, 40);
				 
				 graphics.setColor(Color.green);
				 graphics.fillRect(570, 247, 40, 200);
			}
		public static void fillRoster()
		{
			roster.add(new Team ("Jack", "quarterback", 52, 367, 0, 4, 8));
			roster.add(new Team ("John", "quarterback", 61, 411, 1, 5, 9));
			roster.add(new Team ("biff", "Running Back", 23, 571, 0, 4, 8));
			roster.add(new Team ("Aaron", "Reciever", 73, 876, 0, 3, 9));
			roster.add(new Team ("Lou", "Running Back", 54, 546, 5, 4, 9));
			roster.add(new Team ("Mark", "Mike Linebacker", 0, 0, 87, 2, 6));
			roster.add(new Team ("Bobby Bouche", "waterboy", 0, 0, 92, 5, 10));
			roster.add(new Team ("Oswald", "Safety", 25, 479, 63, 4, 9));
			roster.add(new Team ("Jaxon", "corner", 2, 197, 56, 4, 8));
			roster.add(new Team ("Friday", "corner", 13, 113, 13, 4, 7));
			roster.add(new Team ("Alex", "Outside Linebacker", 0, 56, 82, 5, 8));
			roster.add(new Team ("Mikey", "Mike Linebacker", 2, 0, 65, 4, 9));
			roster.add(new Team ("Jason", "corner", 4, 301, 86, 1, 7));
			roster.add(new Team ("Joseph", "safety", 6, 124, 61, 4, 8));
			roster.add(new Team ("Stangs", "Linebacker and fullback", 72, 1502, 64, 5, 10));
			roster.add(new Team ("Blaze", "Receiver", 42, 420, 0, 2, 4));
			roster.add(new Team ("Tuk Tuk", "Runningback", 14, 902, 0, 4, 9));
			roster.add(new Team ("Saac", "Quarterback", 60, 431, 2, 4, 9));
			roster.add(new Team ("Jose", "quarterback", 72, 397, 1, 4, 8));
			roster.add(new Team ("Wess", "quarterback", 81, 125, 2, 5, 9));
			roster.add(new Team ("Ron", "Running Back", 33, 771, 0, 4, 8));
			roster.add(new Team ("Gerald", "Reciever", 63, 976, 0, 3, 9));
			roster.add(new Team ("Marx", "Running Back", 94, 646, 5, 4, 9));
			roster.add(new Team ("Stalin", "Mike Linebacker", 0, 0, 87, 2, 6));
			roster.add(new Team ("Kennedy", "Outside Linebacker", 0, 0, 1776, 5, 10));
			roster.add(new Team ("Roosevelt", "Safety", 25, 479, 63, 4, 9));
			roster.add(new Team ("Darnell", "corner", 4, 182, 74, 4, 8));
			roster.add(new Team ("William", "corner", 16, 103, 23, 4, 7));
			roster.add(new Team ("Ferg", "Outside Linebacker", 0, 0, 94, 5, 8));
			roster.add(new Team ("Rocky", "Mike Linebacker", 2, 0, 61, 4, 9));
			roster.add(new Team ("Marshal", "corner", 4, 301, 86, 1, 7));
			roster.add(new Team ("Stone", "safety", 6, 124, 61, 4, 8));
			roster.add(new Team ("Rick", "fullback", 94, 1709, 0, 5, 10));
			roster.add(new Team ("Earl", "Receiver", 42, 420, 0, 2, 4));
			roster.add(new Team ("James", "Runningback", 14, 902, 0, 4, 9));
			roster.add(new Team ("Isack", "Quarterback", 800, 1765, 8, 4, 10));
		for (Team t : roster)
			{
				System.out.println(number +  ")" + t.getName() + " , "  + t.getPosition() + ",  coachability is  " + t.getCoachability() + " , "+ t.getOverall());
				number++;
			}
		}
		public static void welcomeCoach()
		{
			System.out.println("Welcome to the 2017 All Canadian Southern Division Draft, My Name is Thad and will be assisting you in your draft choices.");
			System.out.println("These are the available players of the last rounds.You will choose six players who will be evaluated in order to later announce your rank in the draft.");
			System.out.println("Players overall is out of 10 and coachability is out of five");
			System.out.println("This is a mock canadian draft eh, and its a game you know, for fun");
			System.out.println("Not at all for a grade. But if it was....*Canadian'ness intensifies*");
			System.out.println("what was your name again coach?");
			Scanner userInput= new Scanner(System.in);
			String coach = userInput.nextLine ();
			System.out.println("Hello, coach " + coach + "!");
		}
		public static void myTeam()
		{
			for (int i=0 ; i < 6; i++)
				{
			System.out.println("Choose a player by their Number");
			Scanner userInput = new Scanner(System.in);
			int playerNumber = userInput.nextInt ();
			myRoster.add(roster.get(playerNumber-1));
			for (Team m : myRoster)
				{
					System.out.println(number +  ")" + m.getName() + " , "  + m.getPosition() + ",  coachability is  " + m.getCoachability() + " , "+ m.getOverall());
					number++;
					score = roster.get(playerNumber-1).getOverall();
				}
				}
			System.out.println("These are your 2017 Team picks correct? Yes or no");
			Scanner userInput = new Scanner(System.in);
			confirm = userInput.nextLine ();
			if (confirm == "no")
				{
					System.out.println("You may pick one more player. But you may not delete any.");
					Scanner userInput2 = new Scanner(System.in);
					int playerNumber = userInput.nextInt ();
					myRoster.add(roster.get(playerNumber-1));
					for (Team m : myRoster)
						{
							System.out.println(number +  ")" + m.getName() + " , "  + m.getPosition() + ",  coachability is  " + m.getCoachability() + " , "+ m.getOverall());
							number++;
							score = roster.get(playerNumber-1).getOverall();
						}
				}
				
			
		}
		public static void myScore()
		{
			if (confirm.equals("no"))
				{
					System.out.println("You may pick one more player. But you may not delete any.");
					Scanner userInput2 = new Scanner(System.in);
					int playerNumber = userInput2.nextInt ();
					myRoster.add(roster.get(playerNumber-1));
					for (Team m : myRoster)
						{
							System.out.println(number +  ")" + m.getName() + " , "  + m.getPosition() + ",  coachability is  " + m.getCoachability() + " , "+ m.getOverall());
							number++;
							score = roster.get(playerNumber-1).getOverall();
						}
				}
			randomNumber = (int)(Math.random()*58);
			if (score > randomNumber)
				{
			System.out.println("Congratulations! After adding your overall scores, you won the Canadian draft, eh!");
				}
			else if (score < randomNumber)
				{
			System.out.println("Yeah....after adding your overall scores...*sighs* they shouldve made you feild maintanence, get a toque ya hoser, you lost the Canadian draft eh.");
				}
			else if (score == randomNumber)
				{
					System.out.println("Gosh darn eh, you tied for first there bud.");
				}
		}
		
		

	}
