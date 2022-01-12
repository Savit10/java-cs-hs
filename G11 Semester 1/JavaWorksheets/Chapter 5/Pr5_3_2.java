public class Pr5_3_2 {
	
	public static void main (String[] args) {
		double term = 1;
		double pi = 0;
		double sign = 1;
		for (int i = 1; i<=10000; i++)
		{
			term = sign/((2*i)-1);
			pi = pi + term;
			sign = sign * -1;
		}
		pi = 4 * pi;
		IBIO.output("Pi is approximately " + pi);
	}
}
