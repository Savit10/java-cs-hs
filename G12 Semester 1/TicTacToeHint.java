import java.util.*;
public class TicTacToeHint
{
	
	public static void printBoard(char[][] a) // n*(n+n) = O(n^2)
	{
		int rowLength = a.length;	// number of rows
		for(int row = 0; row < rowLength; row++)
        {
			int columnLength = a[row].length;	// number of columns in a row
			for(int col = 0; col < columnLength; col++)
			{
				System.out.print( a[row][col] );
				if(col < columnLength-1)
				{	System.out.print("|");
				}
			}
			System.out.println();
			if(row < rowLength-1)
			{	for(int i = 0; i < columnLength*2-1; i++)
				{	System.out.print("-");
				}
			}
			System.out.println();
        }
	}

	public static boolean printRow(char[][] board, int row)
	{
		if( board == null || row < 0 || row >= board.length )
		{
			return false;
		}
		
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			System.out.print(board[row][col] + " ");
		}
		System.out.println();
		return true;
	}
	
	public static void printColumn(char[][] board, int col)
	{
		if( col < 0 )
		{	col = col * -1;		// col = Math.abs(col);
		}
		if( col > board.length )
		{	col = col % board[0].length;
		}
			
	}
	public static boolean isFull(char [][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if ( array[i][j] == '*')
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static char [][] initializeBoard(int size)
	{
		char[][] board = new char[size][size];
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				board[i][j] = '*';
			}
		}
		return board;
	} 
	public static boolean diagonalCheck(char[][] array)
	{
		int t = 1;
		int v = 1;
		for (int i = 1; i < array.length; i++)
		{
			for (int j = 1; j < array[i].length; j++)
			{
				if (array[0][0]!=array[i][j])
				{
					t = 0;
				}
			}
		}
		for (int i = 0; i < array.length; i++)
		{
			for (int j = array[i].length-1; j > -1; j--)
			{
				if (array[0][0]!=array[i][j])
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
	public static boolean winningCheck(char [][] array)
	{
		boolean t = true;
		boolean k = true;
		for (int i = 0; i < array.length; i++)
		{
			t = true;
			k = true;
			for (int j = 1; j < array.length; j++)
			{
				if (array[i][j-1] != array[i][j])
				{
					t = false;
				}
				if (array[j-1][i] != array[j][i])
				{
					k = false;
				}  
			}
			if (t || k)
			{
				return true;
			}
		}
		if (diagonalCheck(array))
		{
			return true;
		}
		return false;
		
	}
	public static char [][] move (char playerName, char board[][])
	{
		Scanner scann = new Scanner(System.in);
		int row, column;
		System.out.println("It's now Player O's turn");
		do {
			System.out.print("Enter the row number: ");
			row = scann.nextInt();
			while(row >= board.length || row < 0)
			{
				System.out.print("Out of range, enter the row number: ");
				row = scann.nextInt();
			}
			System.out.print("Enter the column number: ");
			column = scann.nextInt();
			while(column >= board.length || column < 0)
			{
				System.out.print("Out of range, enter an in-range column number: ");
				column = scann.nextInt();
			}
			if (board[row][column] != '*')
			{
				System.out.println("Sorry this cell is full, try a different cell");
			}
		} while (board[row][column] != '*');
		board[row][column] = playerName;
		return board;}
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the dimension (length/row number) of the board: ");
		int size = scan.nextInt();
		System.out.println();
		if (size < 3)
		{
			size = 3;
		}
		char [][] board = initializeBoard(size);
		printBoard(board);
		do {
			if (isFull(board))
			{
				System.out.println("Game is tied");
				System.exit(0);
			}
			System.out.println("It's now Player O's turn");
			board = move('O', board);
			if (winningCheck(board))
			{
				System.out.println("Congratulations, the player X has won the game");
				System.exit(0);
			}
			System.out.println("It's now Player X's turn");
			board = move('X', board);
			if (winningCheck(board))
			{
				System.out.println("Congratulations, the player with X has won the game");
				System.exit(0);
			}
		} while (!isFull(board));
		
	}
}
