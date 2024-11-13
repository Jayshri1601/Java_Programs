
public class Cup {
	String type;
	int size;
	
	public Cup()
	{
		//this("a1", 12) call the constructor of the same class
		//taking string and int parameter
		//it is called as constructor chaining
		this("Glass", 20);
		//this("Coffee cup", 15);
	}
	
	public Cup(String type, int size)
	{
		this.type=type;
		this.size=size;
	}
	
	public String toString()
	{
		return "cup type: "+ type +","+ " cup size: " + size;
	}
	public static void main(String args[])
	{
		Cup c1=new Cup();
		//Cup c2=new Cup();
		System.out.println(c1);
		//System.out.println(c2);
	}

}
