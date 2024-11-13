import java.util.Scanner;
public class LinearSearch1{
	
	public void searching(int a[], int key)
	{
		boolean flag =true;
		for(int i=0; i<a.length; i++)
		{
			if(key==a[i])
			{
				System.out.println("Key is found at position:" +" "+ (i+1));
				flag=false;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Key not found");
		}
	}

	public static void main(String[] args) 
	{
		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number you want to search");
		int key=sc.nextInt();
		
		LinearSearch1 ls=new LinearSearch1();
		ls.searching(a,key);
		
	}

}
