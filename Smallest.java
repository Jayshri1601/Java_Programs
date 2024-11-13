import java.util.Scanner;
public class Smallest {
	
	public int minValue(int []a)
	{
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The maximum element is:" + min);
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
		
		Smallest s=new Smallest();
		s.minValue(a);

	}

}
