
public class Factorial
{
	public static void findFactorial()
	{
		Scanner sc=new Scanner(System.in);
		char ch='';
		do
		{
			int fact=1;
			System.outprintln("enter 1st number");
			int num=sc.nextInt();
			do
			{
				fact=fact*num;
				num--;
			}
			while(num>0);
			System.out.println("factorial is"+fact);
			System.out.println("do you want to continue (Y/N)");
			ch=sc.next().charAt(0);
		}
		while(ch=='Y' ||ch=='y');
	}
	public static void main(String[] args) 
	{
		findFactorial();
		// TODO Auto-generated method stub

	}

}
