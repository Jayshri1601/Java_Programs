import java.util.Scanner;
public class Palindrome3 {
	
	public int reverse(int no)
	{
		int d, rev=0;
		
		while(no>0)
		{
			d=no%10;
			rev=rev*10+d;
			no=no/10;
		}
		
	    return(rev);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number:");
		int no=sc.nextInt();
		
	    Palindrome3 p3=new Palindrome3();
	    //int r=p3.reverse(no);
	    //System.out.println("Reverse:"+ r);
	    for( no=1; no<=100; no++)
	    {
	    	
	    	int r=p3.reverse(no);
		    if(r==no)
		    {
		    	System.out.println(no);
		    }
		   /* else
		    {
		    	System.out.println("Not palindrome");
		    }*/
	    }
		

	}

}
