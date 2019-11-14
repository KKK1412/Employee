import java.util.Scanner;

public class EmployeeUI 
{
	public static void main(String[] args) 
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		EmployeeCollection col = new EmployeeCollection();
		while(true)
		{
			System.out.println("---------------ABC Company---------------------");
			System.out.println("1. Adding an Employee");
			System.out.println("2. Delete an Employee");
			System.out.println("3. Display all Employee");
			System.out.println("4. Exit the Application");
			System.out.print("Enter Your Choice : ");
			ch = sc.nextInt();
			try
			{
				switch(ch)
				{
					case 1: 
						System.out.print("Enter Employee Name : ");
						String name = sc.next();
						if(EmployeeValidator.validateEmployeeName(name))
						{
							System.out.print("Enter Employee Designation : ");
							String desig = sc.next();
							if(EmployeeValidator.validateEmployeeDesig(desig))
							{
								System.out.print("Enter Employee Salary : ");
								String salary = sc.next();
								if(EmployeeValidator.validateEmployeeSalary(salary))
								{
									col.addEmployee(name, desig, Double.parseDouble(salary));
								}
							}
						}			
					break;
					case 2:
						System.out.print("Enter Employee ID : ");
						int id = sc.nextInt();
						col.deleteEmployee(id);
					break;
					case 3:
						col.dispEmployee();
					break;
					case 4: System.exit(1);
					break;
					default : System.err.println("Invalid Selection");
				}
			}
			catch(EmployeeException ex)
			{
				System.err.println(ex);
			}
		}
	}
}
