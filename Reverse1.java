
//1.Write a program to accept array of 10 elements and print them in reverse order.

import java.util.Scanner;
class Reverse1
{
	public static void main(String args[])
	{
		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 elements:");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("The reverse order of given elements is:");
		for(int i=(a.length)-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
	}
}