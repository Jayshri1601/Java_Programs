import java.util.Scanner;
public class ArrayDemo4 {
	
	public void arraySum(int []a, int []b)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+b[i]);
		    
		}
		//System.out.println("The sum of array element a and b is:" + sum);
	}
	
	public static void main(String[] args) {
	  int []a=new int[5];
	  int []b=new int[5];
	  Scanner sc= new Scanner(System.in);
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
	  
	  ArrayDemo4 ar=new ArrayDemo4();
	  ar.arraySum(a,b);
	    

	}

}
