import java.util.Scanner;
class DoWhile1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		int choice;
		
		do
		{
		
			System.out.println("1.Addition of the number");
			System.out.println("2.Substraction of the number");
			System.out.println("3.Division of the number");
			System.out.println("4.Multiplication of the number");
			System.out.println("5.Exit");
			
		
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
		
			switch(choice)
			{
				case 1:System.out.println("The addition of a and b is:"+ (a+b));
						break;
						
				case 2:System.out.println("The substraction of a and b is:"+(a-b));
						break;
						
				case 3:System.out.println("The division of a and b is:"+(a/b));
						break;
						
				case 4:System.out.println("The multiplication of a and b is:"+ (a*b));
						break;
						
						
				default:System.out.println("Please enter the valid value");
						break;
				
			}				
			
		}while(choice!=5);
		
	}
}
