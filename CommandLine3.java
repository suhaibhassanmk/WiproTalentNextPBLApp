package languagebasics;

public class CommandLine3 
{

	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(args[0]); //Convert number1 to integer data type
		int num2 = Integer.parseInt(args[1]); //Convert number2 to integer data type
		System.out.println("The sum of "+num1+" and "+num2+" is "+ (num1+num2)); //Prints the sum in the required format 
	}

}
