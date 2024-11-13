
//3. Write a program to accept array of 10 elements and print largest number.

import java.util.Scanner;
class Largest
{
	public static void main(String args[])
	{
	   int []a=new int[10];
	   int max=a[0];
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the array elements:");
	   
	   for(int i=0; i<a.length; i++)
	   {
     	   a[i]=sc.nextInt();
	   }
	   
       for(int i=0; i<a.length; i++)
	   {
		   if(a[i]>max)
		   {
			   max=a[i];
		   }
		   
	   }
       System.out.print("The Largest number in array element is:" + max);	   
	}
	
}