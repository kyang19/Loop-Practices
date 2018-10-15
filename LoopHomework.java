/**
 * 
 * @author kimyang
 *Dice Doubles
 */
public class LoopHomework 
{	
	public static void main(String[] args)
	{
		DicePractice dice1 = new DicePractice();
		DicePractice dice2 = new DicePractice(); 
		
		int num1 = 0;
		int num2 = 1;
		while (num1 != num2)
		{
			num1 = dice1.roll();
			num2 = dice2.roll();
			
			int sum = num1+num2;
			System.out.println(num1 + " " + num2 + "\nSum:  " + sum);
			
			
		}
			System.out.print("The number of rolls it took: " + dice1.getNumRolls());
			
	}
}