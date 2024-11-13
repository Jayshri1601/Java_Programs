import java.util.Scanner;
public class Factorial {
	
	public void numFactor(int no)
	{
		int f=1;
		for(int i=1; i<=no; i++)
		{
			 f=f*i;
		}
		System.out.println("The factorial of "+ no +" is "+ f );
	}

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int no=sc.nextInt();
	   
	  Factorial a= new Factorial();
	   a.numFactor(no);
	   

	}

}
