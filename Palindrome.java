import java.util.Scanner;
public class Palindrome {
	
	public void checkNo(int no, int rem,int temp)
	{
		//int rem1=0;
		int sum=0;
		temp=no;
		while(no>0)
		{
			rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		
		if(temp ==sum)
		{
			System.out.println("The given number is Palindrome number");
		}
		else
		{
			System.out.println("The given number is not palindrome number");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		Palindrome p = new Palindrome();
		int rem = 0;
		int temp = 0;
		p.checkNo(no, rem, temp);
		
		
		
	}

}
