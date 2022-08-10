/* 
 * Searching and Sorting algorithms 
 * Quarter 4 test
 * Tomorrow we take over Google
 * 
 */

public class Q4Test
{
	public static void printArray(String[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (i != array.length-1)
			{
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println(array[array.length-1]);
	}
	
	public static String[] clone(String[] array) // returns a copy of array
	{
		String [] b = new String [array.length];
		for (int i = 0; i < array.length; i++)
		{
			b[i] = array[i];
		}
		return b;
	}

	
	static void bubble(String[] a)
	{	
		boolean swapped = true;
		for(int i = 0; i < a.length && swapped; i++)
		{	swapped = false;
			for(int j = 0; j < a.length - i - 1; j++)
			{	
				if(a[j].compareTo(a[j+1]) > 0)
				{	
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
		}
	} 
	
	public static void selection(String[] a)
	{
		int min;
		String temp;
		for (int i = 0; i < a.length - 1; i++ )
		{
			min = i;
			for(int j = i + 1; j < a.length; j ++)  
			{
				if( a[j].compareTo(a[min]) > 0 )
				{	
					min = j;
				}
			}
			temp = a[ min ];   
			a[ min ] = a[ i ];
			a[ i ] = temp;
		}
	}
	
	public static int linearSearch(String[] array, String key)
	{
		int location = -1;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].equals(key))
			{
				return i;
			}
		}
		return location;
	}

	public static int binarySearch(String[] array, String key)
	{
		if (isSortedAsc(array) == false)
		{
			bubble(array);
			return -2;
		}
		int location = -1;	
		int index = 0;		
		int low = 0;		
		int high=array.length-1; 
		while( low <= high )
		{	
			int mid = (low + high) / 2;
			if( array[mid].equals(key))
			{	
				location = mid;
				break; 
			} 
			else if(key.compareTo(array[mid]) < 0 )
			{	
				high = mid - 1;
			} 
			else
			{	
				low = mid + 1;
			}
		}
		return location;
	}

	public static boolean isSortedAsc(String[] array)
	{
		for ( int i = 0; i < array.length - 1; i++)
		{
			for (int j = i + 1; j < array.length; j++)
			{
				if ((array[i].compareTo(array[j]) < 0))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isSortedDesc(String[] array)
	{
		for ( int i = 0; i < array.length - 1; i++)
		{
			for (int j = i + 1; j < array.length; j++)
			{
				if ((array[i].compareTo(array[j]) > 0))
				{
					return false;
				}
			}
		}
		return true;
	}

	public static String sortedMode(String[] array)
	{
		if (isSortedAsc(array))
		{
			return "ascending";
		}
		else if (isSortedDesc(array))
		{
			return "descending";
		}
		return "unsorted";
	}
	
	public static void main(String[] args)
	{
		System.out.println("Savit Agarwal");
		
		// DO NOT MODIFY THE CODE BELOW THIS COMMENT!!! ////// POLICE LINE DO NOT CROSS //////////////////////////////////////////////////////////////////////
		String[] original = { "dulcie","ernest","vasilis","juanita","saraann","torin","mathian","stanly","georgetta","dalis","taddeo","haroun","clyde","wake","hilary","mallory","prinz","carolin","barton","garnette","hanson","reina","bernice","carmela","drusie","ermentrude","abbey","lene","casey","kahaleel","glennie","kim","afton","wenda","prince","maddalena","nickey","elijah","ashlin","dex","morrie","alvin","jammal","andrej","liza","benedikt","hillard","manon","robby","cari","jilly","carlyn","isa","reg","lincoln","basilio","avivah","jamie","chandal","bourke","heloise","midge","fernandina","gasper","sterling","jemmy","rosco","ardella","curcio","kitti","jamey","alejandrina","kimmie","hervey","hurley","joice","gisele","isac","armin","drusie","edyth","carlie","con","neddie","augustine","loraine","sloan","tilda","meggy","walther","averyl","marshall","meridel","tanny","merry","sibilla","carin","linnie","edy","clayson","zelig","imogene","amandie" };
		String[] b = clone(original);
		String[] s = clone(original);
		System.out.println( "The orginal array is " + sortedMode(original) );
		
		System.out.println("\nBubble sort on array b");
		bubble( b );
		System.out.println( "Array b is sorted in " + sortedMode(b) + " order." );
		
		
		System.out.println("\nSelection sort on array s");
		s = clone(original);
		selection( s );
		System.out.println( "Array s is sorted in " + sortedMode(s) + " order."  );

		System.out.print("\nSearching algorithms\n> Strings to search for: ");
		String[] searches = { "kaori", "benedikt", "dulcie", "amandie", "kitti" };
		int[] locationsL = { -1,45,0,102,69 };
		int[] locationsB = { -1,14,33,4,65 };
		printArray(searches);
		System.out.println();

		for(int i = 0; i < searches.length; i++)
		{
			int linear = linearSearch(original, searches[i]);
			System.out.printf("Linear search for %s (%d): %d\n", searches[i], locationsL[i], linear);
			int binary = binarySearch(b, searches[i]);
			System.out.printf("Binary search for %s (%d): %d\n", searches[i], locationsB[i], binary);
		}
		System.out.println( "\nbinarySearch(original, \"chandal\") [-2 or 24] = " + binarySearch(s, "chandal") );
	}
	
}
