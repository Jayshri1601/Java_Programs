import java.util.Scanner;
public class Ascii1 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the word");
	    char ch=sc.next().charAt(0);
	    
	    if(ch>='A' && ch<='Z')
	    {
	    	System.out.println("Capital letter");
	    }
	    else
	    {
	    	System.out.println("Not capital letter");
	    }

	}

}
