import java.util.Scanner;
//import java.lang.Math.*;

class Game
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1 to 4");
		int no=sc.nextInt();
		
		int luckyno=(int)(Math.random()*10);
		int lucky=luckyno%5;
		System.out.println("The lucky number is:"+lucky);
		
		if(lucky==no)
		{
			System.out.println("Winner!");
		}
		else
		{
			System.out.println("Sorry! Better luck for next time");
		}
		
	}
}