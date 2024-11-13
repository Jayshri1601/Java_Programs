import java.util.Scanner;
import java.lang.Math.*;

class DemoSwitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		
		System.out.println("1.Square of the number");
		System.out.println("2.Cube of the number");
		System.out.println("3.Square root of the number");
		System.out.println("Enter your choice");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:System.out.println("Square:"+no*no);
					break;
					
			case 2:System.out.println("Cube:"+no*no*no);
					break;
					
			case 3:System.out.println("Square root:"+Math.sqrt(no));
					break;
					
			default:System.out.println("Invalid");
					break;
					
		}
		
	}
}