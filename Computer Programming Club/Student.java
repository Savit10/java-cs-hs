//Beginning of on OOP class
public class Student
{
    String name;
    String subject;
    int grade;
    String homebase;
    public Student(String studentName, String studentSubject, int studentGrade, String studentHomebase)
    {
        name = studentName;
        subject = studentSubject;
        grade = studentGrade;
        homebase = studentHomebase;
    }
    public static void main (String[] args)
    {
        Student student1 = new Student("Savit", "Math", 11, "Magee");
        System.out.println(student1.name);
        System.out.println(student1.subject);
        System.out.println(student1.grade);
        System.out.println(student1.homebase);
    }
}

