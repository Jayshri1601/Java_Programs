import java.util.Scanner;
public class EvenOdd {
	
	public void convert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		display(no);
		
	
	}
	
	public void display(int no)
	{
		if(no%2==0)
		{
			System.out.println("The given number is even number- " + no );
		}
		else
		{
			System.out.println("The given number is odd number- " + no);
		}
		
	}

	public static void main(String[] args) {
		EvenOdd e= new EvenOdd();
	    e.convert();
	}

}
