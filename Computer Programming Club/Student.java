public class Student
{
    String name; // all variables in a class are known as attributes
    String subject;
    // attributes can be changed outside the class unless it's a "final" or constant variable/attirbute
    int grade;
    String homebase;
    public Student(String studentName, String studentSubject, int studentGrade, String studentHomebase) 
    // constructor method that initializes attributes of an object (must be the same name as the class)
    {
        name = studentName;
        subject = studentSubject;
        grade = studentGrade;
        homebase = studentHomebase;
    }
    public void printName() // Some theory: a static method  can be called without an object whereas a public method can't
    {
		System.out.println("The student's name is " + name);
	}
    public static void main (String[] args)
    {
        Student student1 = new Student("Savit", "Math", 11, "Magee");
        student1.printName(); //. syntax can be used to access attributes or methods
        
    }
}

