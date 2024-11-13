import java.util.Scanner;
class Demo3
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("The given number is Even Number");
		}
		else
		{
			System.out.println("The given number is odd number");
		}	
		
	}
}