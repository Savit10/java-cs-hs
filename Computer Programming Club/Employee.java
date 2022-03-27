public class Employee 
{
	int id;
	String firstName;
	String lastName;
	int salary;
	public Employee(int identification, String first, String last, int money)
	{
		id = identification;
		firstName = first;
		lastName = last;
		salary = money;
	}
	public void printNameAndSalary()
	{
		System.out.println("The employee is " + this.firstName + " " + this.lastName + " and their salary is " + this.salary);
	}
	public void printHighestPaid()
	{
		System.out.println("The highest paid employee is " + this.firstName + " " + this.lastName + " and his salary is " + this.salary);
	}
	public static Employee SalaryMax(Employee [] a)
	{
		// int [] array = {a[0].salary, a[1].salary, a[2].salary, a[3].salary};
		
		int t = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i].salary > max)
			{
				max = a[i].salary;
				t = i;
			}
		}
		return a[t];	
	}
	public static void main (String[] args) 
	{
		Employee jose = new Employee(001, "Pablo", "Escobar", 50000);
		jose.printNameAndSalary();
		Employee marx = new Employee(042, "Karl", "Marx", 9);
		marx.printNameAndSalary();
		Employee batman = new Employee(007, "Bruce", "Wayne", 10000);
		batman.printNameAndSalary();
		Employee soviet = new Employee(902, "Vladimir", "Putin", 21);
		soviet.printNameAndSalary();
		Employee [] array1 = {jose, marx, batman, soviet};
		Employee highestPaidEmployee = SalaryMax(array1);	
		highestPaidEmployee.printHighestPaid();
	}
}
