
//2.Write a java program to accept array of 10 elements and print their sum.

import java.util.Scanner;

class SumArray
{	
	public static void main(String args[])
	{
		int []a=new int[10];
		int sum=0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0; i<10; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<10; i++)
		{
		   sum=sum+a[i];
		}
		System.out.println("The sum of all elements is:" + sum);	
	}
	
	
	
}