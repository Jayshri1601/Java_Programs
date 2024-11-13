
import java.util.Scanner;
import java.util.Arrays;
public class NumToArray1 {
	
	public void accept(int length)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		String numStr=Integer.toString(no);
		
		char[] numArray=numStr.toCharArray();
		
		for(int i=0; i<numStr.length(); i++)
		{
			numArray[i]=(char) (numStr.charAt(i)-'0');
		}
		
		for(int digit:numArray)
		{
			System.out.println(digit+" ");
		}
		
	}
	

	public static void main(String[] args) {
		
		NumToArray1 n=new NumToArray1();
		n.accept(20);
		
		
       
	}

}
