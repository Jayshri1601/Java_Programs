import java.util.Scanner;

class Digit{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int no=sc.nextInt();
		 
		 if(no<10)
		 {
			 System.out.println("The given number is 1 digit number");
		 }
		 else if(no<100)
		 {
			 System.out.println("The given number is 2 digit number");
		 }
		 else
		 {
			 System.out.println("The given number is 3 digit or more than 3 digit number");
		 }
		 
	}
}