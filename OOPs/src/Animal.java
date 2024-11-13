
public class Animal {
	
	String type;
	String name;
	String color;
	
	public void setData()
	{
	   type="pet";
	   name="cat";
	   color="orange";
	}
	
	public void setColor(String c)
	{
	   color=c;
	}
	
	public String getColor()
	{
	   return color;
	}
	
	public void display()
	{
		System.out.println("Animal Type:"+ type);
		System.out.println("Animal Name:"+name);
		System.out.println("Animal colour:"+color);
	}
	
	
	public static void main(String args[])
	{
	   Animal a=new Animal();
	   a.setData();
	   a.display();
	   a.setColor("Black");
	   System.out.println("Animal Colour:" + a.getColor());
	}
}
