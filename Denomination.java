class Denomination
{
       public static void main(String args[])
	   {
		   int amt=4527;
		   int n=amt/1000;
		   System.out.println("1000 x "+ n);
		   amt=amt%1000;
		   
		   n=amt/500;
		   System.out.println("500 x "+n);
		   amt=amt%500;
		   
		   n=amt/20;
		   System.out.println("20 x "+n);
		   amt=amt%20;
		   
		   n=amt/5;
		   System.out.println("5 x "+n);
		   amt=amt%5;
		   
		   n=amt/2;
		   System.out.println("2 x "+n);
		   amt=amt%2;
		   
	   }
}