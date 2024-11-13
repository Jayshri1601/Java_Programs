//5. Write a program to print accepted array in sorted order

import java.util.Scanner;
class Sort
{
public void bubblesort(int []a,int size)
	{
		
		int temp=0;
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<(size-1)-i; j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public void display(int []a, int size)
	{
		for(int i=0; i<size; i++)
		{
		  System.out.println(a[i]+" ");
		}
		
	}
	
	
	public static void main(String args[])
	{
		Sort s=new Sort();
		//int size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
	    int size=sc.nextInt();
		int []a=new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		s.bubblesort(a,size);
		System.out.println("Before Sorting");
		s.display(a,size);
		
		System.out.println("After Sorting");
		s.display(a,size);
		
	}
}