import java.util.Scanner;
class Character
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		char ch=sc.next(). charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Capital Letter");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Small Letter");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Number");
			
		}
		else {
			System.out.println("Special Character");
		}
	}
	
}