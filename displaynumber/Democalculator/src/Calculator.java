//Package com.dowhile;
import java.util.Scanner;
public class Calculator {
	public static void calculator()
	{
		Scanner sc=new Scanner(System.in);
		char ch='';
		do
		{
			System.out.println("please enter 1st number");
			int n1=sc.nextInt();
			System.out.println("please enter 2nd number");
			int n2=sc.nextInt()
	        System.out.println("1.Addition");
			System.out.println("Substraction");
			System.out.println("please enter your choice");
			int op=sc.nextInt();
			int res=0;
			switch(op)
			{
			case 1:
				res=n1+n2;
				break;
			case 2:
				res=n1-n2;
				break;
				default:
					System.out.println("wrong input");
			}
			System.out.println(res);
			System.out.println("do you want to continue(y/n");
			ch=sc.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
		System.out.println("thank you visit again !!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator();
	}
}
