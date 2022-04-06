// PROBLEM: CLASS AVERAGE IS HALF OF WHAT IT SHOULD BE
public class Markbook
{
	/* scoreToGrade: method to convert a percentage to a letter grade
		85-100 = A
		75-84  = B
		65-74  = C
		50-64  = D
		<50    = F
	*/
	public static String scoreToGrade(double score)
	{	// score is a % from 0 - 100 inclusive
		String grade = "";
		// your code goes here
		if (score < 0 || score > 100)
		{
			System.out.println("Error - invalid parameter");
		}
		else if (score > 84)
		{
			grade = "A";
		}
		else if (score > 74)
		{
			grade = "B";
		}
		else if (score > 64)
		{
			grade = "C";
		}
		else if (score > 49)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		return grade;
	}


	public static String[] calculate(int[][] scores)
	{	// calculate the average grade for each student, then
		// convert it to a letter grade with scoreToGrade method
		// and put result into a 3rd parallel array (averages)
        String[] averages = new String[scores.length];
		// your code goes here
		for (int row = 0; row < scores.length; row++)
		{
			int sum = 0;
			for (int col = 0; col < scores[row].length; col++)
			{
				sum = sum + scores[row][col];
			}
			double average = (double)(sum/(scores[row].length));
			String grade = scoreToGrade(average);
			averages[row] = grade;
		}
        return averages;
	}


	public static double classAverage(int[][] scores)
	{	// calculate the class average based on the 2D array with students scores		
		double studentAverage = 0; // to store the result
		double average = 0;
        // your code goes here
        for (int row = 0; row < scores.length; row++)
		{
			double studentSum = 0; // to add the scores of each student
			for (int col = 0; col < scores[row].length; col++)
			{
				studentSum = studentSum + scores[row][col];
			}
			studentAverage =  studentSum/scores[row].length;
			average = average + studentAverage;
		}
		average = (double)(average/scores.length);
        return average;
	}


	public static void printMarkBook(String[] studentNames, int[][] scores, String[] results)
	{
		String tab = "\t";				// escape code for the tab character
		int classSize = scores.length;  // or studentNames.length(), which should be the same
		System.out.println("\nMarkbook\n========\n");
		for(int s = 0; s < classSize; s++)
		{
			int tests = scores[s].length; // number of tests/scores per student
			System.out.print( studentNames[s] + tab + tab );
			for(int t = 0; t < tests; t++)
			{
				System.out.print( scores[s][t] + tab );
			} // end for loop to output the test scores
			System.out.println( results[s] );
		} // end for loop to go through each student
		double average = classAverage(scores);
		System.out.println("\nClass average = " + average + " = " + scoreToGrade(average) + "\n");
	} // end printMarkBook 


	public static void main (String args[])
	{
		String[] students  = { "Able", "Adam", "Alan", "Geoff", "Jon", "Karl",
							  "Keane", "Louie", "Michael", "Selina" };

		int[][] testScores = {  { 85, 83, 77, 91, 76 },
								{ 80, 90, 95, 93, 48 },
								{ 78, 81, 11, 90, 73 },
								{ 92, 83, 30, 69, 87 },
								{ 23, 45, 96, 38, 59 },
								{ 60, 85, 45, 39, 67 },
								{ 77, 31, 52, 74, 83 },
								{ 93, 94, 89, 77, 97 },
								{ 79, 85, 28, 93, 82 },
								{ 85, 72, 49, 75, 63 }  };

		String[] grades = calculate(testScores);

		printMarkBook(students, testScores, grades);
	} // end main

} // end class

/* EXPECTED OUTPUT ---------------------------------------

Markbook
========

Able            85      83      77      91      76      B
Adam            80      90      95      93      48      B
Alan            78      81      11      90      73      C
Geoff           92      83      30      69      87      C
Jon             23      45      96      38      59      D
Karl            60      85      45      39      67      D
Keane           77      31      52      74      83      D
Louie           93      94      89      77      97      A
Michael         79      85      28      93      82      C
Selina          85      72      49      75      63      C

Class average = 70.94 = C

Reflection question:
If our arrays were defined with a length of 25,
	String[] students = new String[25];
	double[][] scores = new double[25][5];
can you think about an alternative to adding a "lastIndex" variable to keep track of
the end of a partially filled array?
Array of last indexes that look at the last index of all the 1D arrays inside of the
2D arrays and these indexes can be changed by looking at the index of the 1D array 
and finding the last index of that in the array of last indexes and changing that. 
*/
