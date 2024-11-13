import java.util.Scanner;
public class Palindrome1 {
	
	public void show(int no)
	{
		int rem;
		int num=0;
		int temp=no;
		while(no>0)
		{
			rem=no%10;
			num=num*10+rem;
			no=no/10;
		}
		if(temp==num)
		{
			System.out.println("The given number is Palindrome number");
		}
		else
		{
			System.out.println("The given number is not palindrome number");
		}
	}

	public static void main(String[] args) {
		
		Palindrome1 p=new Palindrome1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int no=sc.nextInt();
		p.show(no);
		
		
		
		

	}

}
