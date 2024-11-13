//6.Write a program to print accepted array in descending order.

import java.util.Scanner;
class Descending
{
	public void sortedDescending(int []a)
	{
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<(a.length-1)-i; j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j]=temp;
				}
			}
			//}
			
		}
	}
	
	public void display(int []a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
		
		
		
		
		public static void main(String args[])
		{
		int []a=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Descending d= new Descending ();
		System.out.println("Before sort");
		d.display(a);
		d.sortedDescending(a);
		System.out.println("After sort in descending");
		
		d.display(a);
		
		
	
	}
		
		
}
