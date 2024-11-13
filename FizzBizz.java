class FizzBizz
{
	  public static void main(String args[])
	  {
		  int N;
		  for(N=1; N<=100; N++)
		  {
			  if(N%3==0 && N%5==0)
			  {
				  System.out.print(" FizzBizz ");
			  }
			  else if(N%3==0)
			  {
				  System.out.print(" Fizz ");
			  }
			  else if(N%5==0)
			  {
				  System.out.print(" Bizz ");
			  }
			  else{
				  System.out.print(" "+ N +" ");
			  }
		  }
	  }
}