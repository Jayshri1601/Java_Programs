
public class Charger{
	String type;
	String company;
	float price;

	Charger()
	{
		System.out.println("Default Constructor");
	}
	
	Charger(String type, String company, float price)
	{
		this.type=type;
		this.company=company;
		this.price=price;
	}
	
	public void showData()
	{
		System.out.println("Type:"+type);
		System.out.println("Company name:" +company);
		System.out.println("Price:"+ price);
	}
	
	public static void main(String[] args) {
		Charger c1 = new Charger();
		Charger c2=new Charger("c type", "samsung", 2000.00f);
		c2.showData();

	}

}
