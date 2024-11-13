import java.util.Scanner;
class Demo1
{
	public static void main(String args[])
	{
		//System.out.println("Hello world");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number a=");
		int a=sc.nextInt();
		
		System.out.print("Enter the number b=");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else
		{
			System.out.println("B is greater than A");
		}
		
	}
}