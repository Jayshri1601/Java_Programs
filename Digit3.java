//Write a java program to accept the 10 elements in array and print the sum of all 3 digit number in that array

import java.util.Scanner;
public class Digit3 {

	public void sum(int []a)
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]<=1000 && a[i]>=100)
			{
				sum=sum+a[i];
			}
			else
			{
				System.out.println("The given number is not 3 digit number");
				break;
			}
		}
		System.out.println("The sum 3 digit array element is:"+sum);
	}
	public static void main(String[] args) {
		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Digit3 d=new Digit3();
		d.sum(a);
	}

}
