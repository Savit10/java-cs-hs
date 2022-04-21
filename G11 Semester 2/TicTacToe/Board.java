import java.util.Scanner;
public class Board {
	int size;
	char [][] array;
	public void setSize(int size)
	{
		this.size = size;
		array = new char [size][size];
	}
	public void printBoard() // size indicates the size of the array
	{
		for (int i = 0; i < size; i++)
		{
			System.out.println ("-".repeat(size*4));
			for (int j = 0; j < size; j++)
			{
				if (j==0)
				{
					System.out.print("|");
				}
				System.out.print(" " + array[i][j] + " |");
			}
			System.out.println();
		}
		System.out.println ("-".repeat(size*4));  	
	}
	public boolean lengthAndRowCheck(String [] array)
	{
		for (int j = 1; j < array.length; j++)
		{
			if (array[0] != array[j] || array[0] == null || array[j] == null)
			{
				return false;
			}
		}
		return true;
	} 
	public boolean diagonalCheck(String [][] array)
	{
		int t = 1;
		int v = 1;
		for (int i = 1; i < array.length; i++)
		{
			for (int j = 1; j < array[i].length; j++)
			{
				if (!(array[0][0].equals(array[i][j])) || array[0][0] == null || array[i][j] == null)
				{
					t = 0;
				}
			}
		}
		for (int i = 0; i < array.length; i++)
		{
			for (int j = array[i].length-1; j > -1; j--)
			{
				if (!(array[0][0].equals(array[i][j])) || array[0][0] == null || array[i][j] == null)
				{
					v = 0;
				}
			}
		}
		if (t == 0 && v== 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	} 
	public boolean winningCheck()
	{
		for (int i = 0; i < array.length; i++)
		{
			if (lengthandRowCheck(array[
	}	
	public static void main (String[] args) {
		Board board = new Board();
		board.setSize(5);
		board.printBoard();
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1's name?");
		String name = sc.next();
		System.out.println("Player 1 has what type of shape? ");
		String shape = sc.next();
		Player player1 = new Player (name, shape);
		System.out.println("Player 2's name?");
		name = sc.next();
		System.out.println("Player 2 has what type of shape?");
		shape = sc.next();
		Player player2 = new Player (name, shape);
		while ()
		{
			System.out.println("Enter a row number for " + player1.name + "'s move?");
			int row = sc.nextInt();
			System.out.println("Enter a column number for " + player1.name + "'s move?");
			int row = sc.nextInt();
		}
	}
}

