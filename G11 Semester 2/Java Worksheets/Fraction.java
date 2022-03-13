// chapter 11 starting code
import java.util.Scanner;

public class Fraction {
	private int       num;
	private int       den;
	
	Fraction(int a, int b)
	{
		num = a;
		den = b;
	}
	void printFraction()
	{
		System.out.println(num + "/" + den);
	}
	public static void main(String [] args)
	{
		Fraction f = new Fraction(3,4);
		f.printFraction();
	}
	
}





