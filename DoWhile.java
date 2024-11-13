import java.util.Scanner;
class DoWhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		char ch;
		
		
		do
		{
			System.out.println("Enter any number");
			int no=sc.nextInt();
			sum=sum+no;
			System.out.println("Do you want to add another number? y/n");
		    ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
		System.out.println("The sum of entered number is:" + sum);
	}
}