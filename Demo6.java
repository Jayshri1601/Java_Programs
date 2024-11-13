import java.util.Scanner;

public class Demo6 {
	
	public void sumNo(int []a)
	{
	   int sum=0;
       for(int i=0; i<a.length; i++)
       {
    	  sum=sum+a[i];
       }
       System.out.println("The sum of all array element is"+" "+sum);
	}
	public static void main(String args[])
	{
		int []a=new int[10];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array elements");
       for(int i=0; i<a.length; i++)
       {
    	   a[i]=sc.nextInt();
       }
       
       Demo6 d= new Demo6();
       d.sumNo(a);
       
       
	}

}
