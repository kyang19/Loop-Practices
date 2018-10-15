/**
 * @author kimyang
 * Dice Combination
 */
import java.util.Scanner;

public class SecondLoopPrac 
{

	public static void main(String[] args) 
	{
		DicePractice dice1 = new DicePractice();
		DicePractice dice2 = new DicePractice();
		
		Scanner in = new Scanner(System.in);
		boolean inputisgood = false;
		int number;
		
		while (!inputisgood)
		{
			System.out.println("Enter a number between 2 and 12: ");
			
			if (in.hasNextInt())
			{
				number = in.nextInt();
				in.nextLine();
				
					if (number <= 2 || number >= 12)
						System.out.print("Invalid input. ");
					
					else
					{
						int roll1 = dice1.roll();
						int roll2 = dice2.roll();
						int sum;
						
						while ((roll1 + roll2) != number)
						{
							roll1 = dice1.roll();
							roll2 = dice2.roll();
							sum = roll1 + roll2;
							System.out.println("Dice One rolled: " + roll1);
							System.out.println("Dice Two rolled: " + roll2);
							System.out.println("The sum of the two rolls is :" + sum);
						}
						
						System.out.println("It took " + dice1.getNumRolls() + " rolls.");
						System.out.println("YAY you got your number!");
						
						inputisgood = true;	
					}
			}			
			else
				System.out.println("Invalid input. "); 
			in.nextLine();
		}
	}	
}
