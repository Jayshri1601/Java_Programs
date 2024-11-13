class ArrayDemo1
{
    public static void main(String args[])
	{
		int []a={10,20,30,40,50};
		int sum=0;
		
		System.out.println("Length:" + a.length);
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of all number is: " + sum);
	}
}