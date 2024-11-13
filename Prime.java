import java.util.Scanner;
class Prime
{
     public static void main(String args[])
	 {
		 int temp=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any number");
		 int no=sc.nextInt();
		 
		 for(int i=1; i<=no; i++)
		 {
			 if(no%i==0)
			 {
				 temp++;
			 }
		 }
		 if(temp==2)
		 {
			 System.out.println("The given number is prime number:"+no);
		 }
		 else
		 {
			 System.out.println("The given number is not prime number"+ no);
		 }
	 }
}