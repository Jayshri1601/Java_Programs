class Pattern2
{
	public static void main(String args[])
	{
		/*char i,j;
		for(i='A'; i<='E'; i++)
		{
			for(j='A'; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		int i,j;
		for(i=65; i<=69; i++)
		{
			for(j=65; j<=i; j++)
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
		
	}
}