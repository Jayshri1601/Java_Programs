import java.util.Scanner;
class Matrix2d1
{
	public static void main(String args[])
	{
		int [][]a=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The given matrix is");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		
	}
}