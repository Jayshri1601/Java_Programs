import java.util.Scanner;
public class ArrayToNum2 {
	
	public void show(int []a)
	{
		int num=0;
		for(int i=0; i<a.length; i++)
		{
			num=num*10+a[i];
		}
		System.out.print("The number is " +num);
		
	}

	public static void main(String[] args) {
		ArrayToNum2 b=new ArrayToNum2();
	    int []a=new int[5];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the elements");
	    for(int i=0; i<a.length; i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	     b.show(a);
          
	}

}
