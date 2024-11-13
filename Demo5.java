import java.util.Scanner;
public class Demo5{
	
	
	public void armstrong(int no)
	{
		int sum=0;
		int temp=no;
		
		while(no>0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		
		if(temp==sum)
		{
			System.out.println("The given number is Armstrong number");
		}
		else
		{
			System.out.println("The given number is not Armstrong number");
		}
	}

	public static void main(String[] args) 
	{
		Demo5 d=new Demo5();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		d.armstrong(no);
		
		
			
		
	}
		

}
