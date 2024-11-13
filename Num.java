//Command Line Arguments
//java Num 1 2 3 4 5 6 - at runtime, provide the numbers which we want to create array
class Num
{
    public static void main(String args[])
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.print(Integer.parseInt(args[i]));
		}
		
	}
}