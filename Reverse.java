import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any four digit number");
		int no=sc.nextInt();
		
		if(no<=9999)
		{
			for(int i=0; i>=no; i--)
			{
				System.out.println("The reverse number is:" + no);
			}
		}
		else
		{
			System.out.println("The given number is not four digit number");
		}
		 
	}
}