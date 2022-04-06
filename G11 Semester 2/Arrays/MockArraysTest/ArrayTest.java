/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class ArrayTest
{
	// Array size:
	public static int size(double[] array)
	{
		int result = array.length; // modify
		return result;
	}
	//------------------------------------------------------------------

	public static double min(double[] array)
	{
		double min = array[0];
		// Minimum: the code for your method (function) goes here
		for (int i = 1; i < size(array); i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		return min;
	}
	//------------------------------------------------------------------
	
	public static double max(double[] array)
	{
		double max = array[0];
		// Maximum: the code for your method (function) goes here
		for (int i = 1; i < size(array); i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
	//------------------------------------------------------------------

	public static double range(double[] array)
	{
		double result = 0; 
		// Range: the code for your method (function) goes here
		result = max(array) - min(array);
		return result;
	}
	//------------------------------------------------------------------

	public static double average(double[] array)
	{
		double result = 0;
		// Average: the code for your method (function) goes here
		double sum = 0.0;
		for (int i = 0; i < size(array); i++)
		{
			sum = sum + array[i];
		}
		result = sum/size(array);
		return result;
	}
	//------------------------------------------------------------------

	public static double median(double[] array)
	{
		double result = 0;
		// Median: the code for your method (function) goes here
		Arrays.sort(array);
		if ((size(array)) % 2 == 0)
		{
			result = (array[size(array)/2] + array[(size(array)/2)-1])/2;
		}
		else 
		{
			result = array[size(array)/2];
		}
		return result;
	}
	//------------------------------------------------------------------

	public static double mode(double[] array)
	{
		double result = 0;
		// Mode: the code for your method (function) goes here
		int maxCounter = 0;
		int modeIndex = -1;
		for (int i = 0; i < size(array); i++)
		{
			int counter = 0;
			for (int j = 0; j < size(array); j++)
			{
				if (array[i] == array[j])
				{
					counter++;
				}
			}
			if (counter > maxCounter)
			{
				maxCounter = counter;
				modeIndex = i;
			}
		}
		if(modeIndex != -1)
		{
			result = array[modeIndex];
		}
		return result;
	}
	//------------------------------------------------------------------
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		System.out.println("Savit Agarwal \n Singapore Rainfall Statistics");
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");
		
		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + size(rainfall) );
		System.out.println( "Minimum   (0.2): " + min(rainfall) );
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.println( "Range   (765.7): " + range(rainfall) );
		System.out.println( "Average (178.89): " + average(rainfall) );
		System.out.println( "Mode    (127.2): " + mode(rainfall) );
		System.out.println( "Median  (159.7): " + median(rainfall) );

		System.out.println();
		
		System.out.println( "\nSingapore Temperature Statistics" );
		System.out.println( "Measurements   : " + size(temperature) );
		System.out.println( "Minimum  (25.4): " + min(temperature) );
		System.out.println( "Maximum  (29.5): " + max(temperature) );
		System.out.println( "Range     (4.1): " + range(temperature) );
		System.out.println( "Average (27.62): " + average(temperature) );
		System.out.println( "Mode     (27.3): " + mode(temperature) );
		System.out.println( "Median   (27.7): " + median(temperature) );

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


