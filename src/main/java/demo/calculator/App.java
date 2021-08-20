package demo.calculator;

import java.util.Scanner;

public class App 
{
	static Scanner sc = new Scanner(System.in);
	static void display()
	{   
		Double operand1,operand2;
		Integer option;
		boolean exit = true;
		
		while(exit == true)
		{
			System.out.println("Enter Operand1:");
			operand1 = sc.nextDouble();
			System.out.println("Enter Operand2:");
			operand2 = sc.nextDouble();
			System.out.println("Choose Operation :");
			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");
			System.out.println("5. Modulus (%)");
			
			option = sc.nextInt();
			
			exit = getOutput(operand1,operand2,option);
		}
		sc.close();
	}
	static boolean getOutput(Double operand1,Double operand2,Integer option)
	{   
		int check;
		System.out.print("Result : ");
		switch(option)
		{
			case 1: System.out.println(operand1+operand2);
					break;
			case 2: System.out.println(operand1-operand2);
					break;
			case 3: System.out.println(operand1*operand2);
					break;
			case 4: System.out.println(operand1/operand2);
					break;
			case 5: System.out.println(operand1%operand2);
					break;
			default : System.out.println("Invalid option try again!!!");
			          break;
				
		}
		System.out.println("Do you want to continue : \n 1.yes \n 2.no ");
		check = sc.nextInt();
		if(check == 1)
			return true;
		else
			return false;
	}
    public static void main( String[] args )
    {
        display();
    }
}
