public class May2019Q15Algorithm{
	
	public static void main (String[] args) {
		int limit = 4;
		int minimum;
		int [] values = {20, 6, 38, 50, 40};
		for (int i = 0; i < limit; i++)
		{
			minimum = i;
			for (int j = i + 1; j <=limit; j++)
			{
				if (values[j]<values[minimum])
				{
					minimum = j;
				}
			}
			if (minimum != i)
			{
				int temporary = values[minimum];
				values[minimum] = values[i];
				values[i] = temporary;
			}
		}
	}
}

