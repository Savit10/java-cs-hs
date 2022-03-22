public class Employee {
	
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
	public int SalaryMax(Employee employee1, Employee employee2, Employee employee3, Employee employee4)
	{
		int [] array = {employee1.salary, employee2.salary, employee3.salary, employee4.salary};
		int max = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
	
	public static void main (String[] args) {
		Employee jose = new Employee(001, "Pablo", "Escobar", 50000);
		Employee marx = new Employee(042, "Karl", "Marx", 9);
		Employee batman = new Employee(007, "Bruce", "Wayne", 100000);
		Employee soviet = new Employee(902, "Vladimir", "Putin", 21);
		System.out.println(
	}
}

