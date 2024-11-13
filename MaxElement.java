import java.util.Scanner;
public class MaxElement {
	
	public int maxValue(int []a)
	{
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The maximum element is:" + max);
		return 1;
	}

	public static void main(String[] args) {
		int []a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		MaxElement m=new MaxElement();
		m.maxValue(a);

	}

}
