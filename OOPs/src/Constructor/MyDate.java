package Constructor;

public class MyDate
{
	private int dd,mm,yy;
	public MyDate()
	{
		System.out.println("I am in default constructor");
		dd=21;
		mm=5;
		yy=2024;
	}
	public void setDd(int d)
	{
		dd=d;
	}
	public int getDd()
	{
		return dd;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public int getMm()
	{
		return mm;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	public int getYy()
	{
		return yy;
	}
	public void show()
	{
		System.out.println("Date is "+dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) 
	{
		MyDate obj=new MyDate();
		obj.show();
		// TODO Auto-generated method stub
	}
}
