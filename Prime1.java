import java.util.Scanner;
public class Prime1 {
	
	
	public void showData(int n,int count)
	{
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("The given number is prime number");
			
		}
		else
		{
			System.out.println("The given number is not prime number");
		}
		
	}

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Prime1 p = new Prime1();
		p.showData(n, count);
	}

}
