//Hierarchical Inheritance Example
public class Emp {
	int eid;
	String ename;
	float salary;
	
	public void setData(int eid, String ename, float salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		
	}
	
	public void showData()
	{
		System.out.println("Employee ID:"+ this.eid);
		System.out.println("Employee Name:"+ this.ename);
		System.out.println("Salary:"+this.salary);
	}

}
