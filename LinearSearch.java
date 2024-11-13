
import java.util.Scanner;
class LinearSearch
{
	public static void main(String args[])
	{
		int []a=new int[20];
		
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 elements");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		
        System.out.println("Enter the element you want to search");
		int key=sc.nextInt();  
		boolean flag=false;	
	
        for(int i=0; i<5; i++)
		{
			if(key==a[i])
			{
				System.out.println("Element found at position:"+ (i+1));
				flag=true;
				
			}
			
		}
		if(flag==false)
			{
				System.out.println("Key not found");
			}
		
			
	}
}