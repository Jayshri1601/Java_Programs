import java.util.Scanner;
public class BubbleSort2 {
	
	public int bubble(int []a)
	{
		int temp;
		for(int i=0; i<a.length; i++)
		{
		   for(int j=0; j<(a.length-1)-i; j++)
		   {
			   if(a[j]>a[j+1])
			   {
				   temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
			   }
		   }
		}
			
		return 0;
	}
	
	public int display(int []a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		return 0;
	}

	public static void main(String[] args) {
		int []a=new int[10];
		BubbleSort2 b=new BubbleSort2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Before Sort");
		b.display(a);
		b.bubble(a);
		
		System.out.println("After sort");
		b.display(a);
		
		
		
	}

}
