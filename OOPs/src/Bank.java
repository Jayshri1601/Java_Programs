
public class Bank {
	
	long accno;
	String name;
	double balance;
	
	public void setData()
	{  
	  accno=12345678;
	  name="XYZ";
	   
	}
	
	public void showData()
	{
		System.out.println("The customer account number is:"+accno);
		System.out.println("Customer name:"+ name);
		
	}
	
	public void setBalance(double b)
	{
		balance=b;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setData();
		b.showData();
		b.setBalance(5000);
		System.out.println("Available balance is:"+ b.getBalance());

	}

}
