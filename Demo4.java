import java.util.Scanner;
public class Demo4 {
	
	
	public int numAdd(int []a,int []b)
	{
		System.out.println("The sum of array element");
		for(int i=0; i<a.length; i++)
		{
		   System.out.println(a[i]+b[i]);
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
	 
		Demo4 d=new Demo4();
		int []a=new int[10];
		int []b=new int[10];
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the second array elements");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		d.numAdd(a,b);
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		

	}

}
