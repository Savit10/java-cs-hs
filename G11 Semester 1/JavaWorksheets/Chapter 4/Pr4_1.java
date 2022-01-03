
public class Pr4_1 {
	
	public static void main (String[] args) {
		int num1 = IBIO.inputInt("Enter a number: ");
		int num2 = IBIO.inputInt("Enter another number: ");
		int num;
		do
		{
			IBIO.output("Press:     [1] for addition");
			IBIO.output("           [2] for multiplication");
			IBIO.output("	   [3] for quit");
			num = IBIO.inputInt();
			switch(num)
			{ case 1:
				break;
			  case 2:
				break;
			  case 3:
			    break;
			  default:
				IBIO.output("Error");
			}
		} while(num != 3);
	}
}
