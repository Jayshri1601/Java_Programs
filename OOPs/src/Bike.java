public class Bike {
        String name;
        String company;
        float price;
        String type;
       
        //default constructor
        Bike()
        {
           System.out.println("Bike");
        }
        
        //Parameterized constructor
        Bike(String name, String company, String type, float price)
        {
        	this.name=name;
        	this.company=company;
        	this.type=type;
        	this.price=price;
        }
        
        public void showData()
        {
        	System.out.println("Bike name:" + name);
        	System.out.println("Bike company:" + company);
        	System.out.println("Bike type:"+ type);
        	System.out.println("Bike price:"+ price);
        }

	   public String getName() {
			return name;
		}

	   //If we want to change specific property then we can used setter method
		public void setName(String name) {
			this.name = name;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		//when we print the object,then 
		//className@hashCode
		//when we define toString() method then this method
		//gets called automatically
		public String toString()
		{
			return "Bike Name: "+ name +"Company: "+company+ "Type: "+type+"price "+ price;
		}



	public static void main(String[] args)
	{
		
          Bike b1 = new Bike();  //default constructor called 
          Bike b2=new Bike("Unicorn", "Honda", "Petrol based", 100000.00f);
          System.out.println("Bike name:"+ b2.getName());
          System.out.println("Bike Company:"+ b2.getCompany());
          System.out.println("Bike Type:"+ b2.getType());
          System.out.println("Bike Price:"+ b2.getPrice());
          b2.showData();
          
          //when we print the object then
          //className@hashCode
          //System.out.println(b1.toString());
          System.out.println(b2.toString());
          
          
          b1.setName("Shine");
          b1.setCompany("Honda");
          b1.setType("Petrol based");
          b1.setPrice(80000.00f);
          
          System.out.println("Bike Name:" + b1.getName());
          System.out.println("Company Name:"+ b1.getCompany());
          System.out.println("Type:"+ b1.getType());
          System.out.println("Price:"+ b1.getPrice());         
	}

}