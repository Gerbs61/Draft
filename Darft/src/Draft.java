import java.util.ArrayList;
import java.util.Scanner;

public class Draft
	{
		static int randomNumber;
		static int number = 1;
		static int score;
		static String confirm;
		static ArrayList<Team> roster = new ArrayList<Team>();
		static ArrayList<Team> myRoster = new ArrayList<Team>();
		public static void main(String[] args)
			{
			welcomeCoach();
			fillRoster();
			myTeam();
			myScore();
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
