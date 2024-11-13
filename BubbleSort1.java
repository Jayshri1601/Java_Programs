
public class BubbleSort1 {
	
	public void bubble(int []a)
	{
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<(a.length-1)-i; j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public void display(int []a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		
		BubbleSort1 b=new BubbleSort1();
		int []a= {4,54,12,42,56,52,79,23,57,2};
		System.out.println("Before Sort");
		b.display(a);
		System.out.println("After sort");
		b.bubble(a);
		b.display(a);
		
		
		
		
		
		

	}

}
