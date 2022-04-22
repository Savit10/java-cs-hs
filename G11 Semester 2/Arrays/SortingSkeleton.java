/* Sorting algorithms assignment
 * 
 * Student Name: Savit Agarwal
 * 
 * 
 * Please read https://en.wikipedia.org/wiki/Insertion_sort
 */
public class SortingSkeleton
{
	public static void printArray(int[] array)
	{
		for( int e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	static void bubble(int[] a)
	{
		boolean swapped;
		for (int i = 0; i < a.length-1; i++)
		{
			swapped = false;
			for (int j = 0; j < a.length-i-1; j++)
			{
				if (a[j] > a[j+1])
				{
					int pos = a[j];
					a[j] = a[j+1];
					a[j+1] = pos;
					swapped = true;
				}
			}
			if (swapped == false)
			{
				break;
			}
		}
	}

	public static void selection(int[] a)
	{
		int min;
		int minIndex;
		boolean swapped;
		for (int i = 0; i < a.length-1; i++)
		{
			swapped = false;
			minIndex = i;
			min = a[minIndex];
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] < min)
				{
					min = a[j];
					minIndex = j;
					swapped = true;
				}
			}
			if (swapped = true)
			{
				int pos = a[i];
				a[i] = min;
				a[minIndex] = pos;
			}
		}		
	}
	static void bubbleDesc(int[] a)
	{
		boolean swapped;
		for (int i = 0; i < a.length-1; i++)
		{
			swapped = false;
			for (int j = 0; j < a.length-i-1; j++)
			{
				if (a[j] < a[j+1])
				{
					int pos = a[j];
					a[j] = a[j+1];
					a[j+1] = pos;
					swapped = true;
				}
			}
			if (swapped == false)
			{
				break;
			}
		}
	}

	public static void selectionDesc(int[] a)
	{
		int max;
		int maxIndex;
		boolean swapped;
		for (int i = 0; i < a.length-1; i++)
		{
			swapped = false;
			maxIndex = i;
			max = a[maxIndex];
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] > max)
				{
					max = a[j];
					maxIndex = j;
					swapped = true;
				}
			}
			if (swapped = true)
			{
				int pos = a[i];
				a[i] = max;
				a[maxIndex] = pos;
			}
		}		
	}
	// https://youtu.be/JU767SDMDvA
	public static void simpleInsertion(int[] a)
	{
		for(int i = 1; i < a.length; i++) // traverse the array
		{
			int j = i; // j=temporary index to sort items; starts from 2nd element in the array; you may say this is the index of the key or element being compared
			while(j > 0 && a[j-1] > a[j]) // stop at j=1 ...
			{	// ... comparing key to the element to its left
				// if they are out of order, swap them until they are
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
				System.out.print(">>> ");
				printArray(a);
			}
		}
	}

	// https://youtu.be/OGzPmgsI-pQ
	public static void insertion(int[] a)
	{
		for (int i = 1; i < a.length; i++)
		{	int key = a[i]; // element being compared
			int j = i - 1;  // index of element before the key
			/* Move elements of array to make room to insert 
			they key in its right place */
			while (j >= 0 && a[j] > key)
			{	a[j + 1] = a[j]; 
				j = j - 1;
				System.out.print(">> "); printArray(a);
			} 
			a[j + 1] = key; // place the key in the right place
			printArray(a); System.out.println();
		} 
	}
	
	public static int linearSearch(int [] a, int data)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == data)
			{
				return i;
			}
		}
		return -1;
	}
	public static int binarySearchAsce(int [] a, int data)
	{
		int start = 0;
		int end = a.length-1;
		while ( start <= end)
		{
			int mid = (start + end)/2;
			if (data == a[mid])
			{
				return mid;
			}
			else if (data > a[mid])
			{
				start = mid + 1;
			}
			else 
			{
				end = mid - 1;
			} 
		}	
		return -1;
	}
	// No need to modify the main method.
	public static void main(String[] args)
	{
		int[] original = { 7,9,6,8,1,3,5,2,4 };
		int[] array = clone(original);
		System.out.println("Original array");
		printArray(original);
		
		// testing linear search
		System.out.println();
		System.out.println("Linear Search");
		int x = linearSearch(array, 7);
		int y = linearSearch(array, 4);
		int z = linearSearch(array, 1);
		System.out.println("The index of 7 is " + x);
		System.out.println("The index of 4 is " + y);
		System.out.println("The index of 1 is " + z);
		
		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		selection( array );
		printArray(array);
		
		//testing binary search
		System.out.println();
		System.out.println("Binary Search");
		x = binarySearchAsce(array, 1);
		y = binarySearchAsce(array, 9);
		z = binarySearchAsce(array, 5);
		System.out.println("The index of 1 is " + x);
		System.out.println("The index of 9 is " + y);
		System.out.println("The index of 5 is " + z);
		
		
		System.out.println("\nBubble sort descending");
		array = clone(original);
		bubbleDesc( array );
		printArray(array);
		
		System.out.println("\nSelection sort descending");
		array = clone(original);
		selectionDesc( array );
		printArray(array);

		System.out.println("\nSimple Insertion sort");
		array = clone(original);
		simpleInsertion( array );
		printArray(array);

		System.out.println("\nInsertion sort");
		array = clone(original);
		insertion( array );
		printArray(array);

	}
}
