import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeCollection 
{
	ArrayList<Employee> emp = new ArrayList<>();
	
	public void addEmployee(String name, String desig, double salary)
	{
		Employee e = new Employee(name,desig,salary);
		emp.add(e);
//		emp.add(new Employee(name,desig,salary));
		System.out.println("Employee Added Successfully with Employee ID : "+e.getEmpId());
	}
	public void deleteEmployee(int empid)
	{
		emp.remove(empid-1);
		System.out.println("Employee ID : "+empid+" is deleted from the system");
	}
	public void dispEmployee()
	{
		Iterator<Employee> it = emp.iterator();
		if(it.hasNext())
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		else
		{
			System.err.println("List is Empty");
		}
	}
}
