import java.util.Scanner;
class Matrix2d
{
	public static void main(String args[])
	{
		int [][]a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element by 3x3 matrix");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
					
			}
		}
		
		/*System.out.println("The given matrix is:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.printf("%4d", a[i][j]);
					
			}
			System.out.println();
		}*/
		
		System.out.println("The given transpose matrix is:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.printf("%4d", a[j][i]);
					
			}
			System.out.println();
		}
		
	}
}