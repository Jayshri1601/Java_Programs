
//Linear Search

import java.util.Scanner;
class ArraySearching
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		
		System.out.println("Enter any 10 elements");
		for(int i=0; i<10; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Search any number you want:");
		int key=sc.nextInt();
		boolean flag=false;
		for(int i=0; i<10; i++)
		{
			if(a[i]==key)
			{
				System.out.println("Key found at position:" + (i+1));
				flag=true;
				//break;
			}
		}
		if(flag==false)
		{
			System.out.println("Key not found");
		}
		
		
	}
}