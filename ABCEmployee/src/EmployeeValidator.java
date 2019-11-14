import java.util.regex.Pattern;

public class EmployeeValidator 
{
	public static boolean validateEmployeeName(String name) throws EmployeeException
	{
		String ptrn = "[A-Z]{1}[a-z]{5,10}";
		if(Pattern.matches(ptrn, name))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("Name should start with Capital Letters and min 6 to max 11 characters");
		}
	}
	public static boolean validateEmployeeDesig(String desig) throws EmployeeException
	{
		String ptrn="[Manager|ITAdmin|SWEngineer|Accounts|HR]{2,11}";
		if(Pattern.matches(ptrn, desig))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("Invalid Designation");
		}
	}
	public static boolean validateEmployeeSalary(String salary) throws EmployeeException
	{
		String ptrn="\\d{4,6}";
		if(Pattern.matches(ptrn,salary))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("Salary shoulb be min 4 to max 6 digits");
		}
	}
}
