import java.util.Scanner;

class Swapping
{
	public static void main(String args[])
	{
		int []a=new int[10];
		int []b=new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements a");
		for(int i=0; i<10; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the array elements b");
		for(int i=0; i<10; i++)
		{
			b[i]=sc.nextInt();
		}
		
	    System.out.println("Swapping of two array elements is");
		for(int i=0; i<10; i++)
		{
			int temp=0;
			temp=a[i];
			a[i]=b[i];
			b[i]=temp;
		}
		
		System.out.println("After swapping array element a is");
		for(int i=0; i<10; i++)
		{
			System.out.println(a[i]);
		}
	
		System.out.println("After swapping array element b is");
		for(int i=0; i<10; i++)
		{
			System.out.println(b[i]);
		}
	
	}
}