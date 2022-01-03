public class Pr4_2 {
	
	public static void main (String[] args) {
		int sum=0;
		int num;
		for (int i=1; i<=1000; i++)
		{
			int modulo = i%3;
			num = 0;
			switch(modulo)
			{
				case 0:
					num = i*-5;
					break;
				case 1:
					num = i*7;
					break;
				case 2:
					num = i*2;
					break;
			}
			sum = sum + num;
		}
		System.out.println(sum);
	}
}
