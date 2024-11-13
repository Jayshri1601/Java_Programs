//8.
import java.util.Scanner;
class ArrayToNum
{
	public static void main(String args[])
	{ 
		int []a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		
		for(int i=0; i<a.length; i++)
		{
		   a[i]=sc.nextInt();
		}
		
		
		int num=0;
		for(int i=0; i<a.length; i++)
		{
			num=num*10+a[i];
		}
		System.out.println(num);
	}
}