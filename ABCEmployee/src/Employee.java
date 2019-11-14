public class Employee 
{
	private int empid;
	private String name, desig;
	private double salary;
	private static int count;
	
	public Employee()
	{
		name="default";
		desig="default";
		salary=0.0;
		count++;
		empid=count;
	}
	public Employee(String name, String desig, double salary)
	{
		this.name=name;
		this.desig=desig;
		this.salary=salary;
		count++;
		empid=count;
	}
	public int getEmpId()
	{
		return empid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDesig(String desig)
	{
		this.desig=desig;
	}
	public String getDesig()
	{
		return desig;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return empid+"\t"+name+"\t"+desig+"\t"+salary;
	}
}
