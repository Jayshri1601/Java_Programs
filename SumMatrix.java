import java.util.Scanner;
class SumMatrix
{
	public static void main(String args[])
	{
		int [][]a=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix 1 elements");
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the matrix 2 elements");
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The sum of given 2 matrix is");
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.println( a[i][j] + a[i][j]);
			}
			System.out.println();
		}
		
		/*System.out.println("The sum of given 2 matrix is");
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.println( a[i][j] +a[i][j]);
			}
			System.out.println();
		}*/
		
		
	}
}