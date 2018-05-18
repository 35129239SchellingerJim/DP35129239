import static org.junit.Assert.*;
import java.util.Stack;

import org.junit.Test;
import java.util.Scanner; 

public class runProgram {

	@Test
	public void test() 
	{
		// Create stack and variable x
		Stack<String> stack = new Stack<String>();
		VarX x= new VarX();
		
		// "Befehles" objects  
		Ldc cLdc = new Ldc(stack);
		Mult cMult = new Mult(stack);
		Store cStore = new Store(stack,x);
		Ld cLd = new Ld(stack,x);
		Print cPrint = new Print(stack);
		
		// reader instance with handler 
		Handlern[] theHandlern= new Handlern[5];
		theHandlern[0]=	cLdc;
		theHandlern[1]=	cMult;
		theHandlern[2]=	cStore;
		theHandlern[3]=	cLd;
		theHandlern[4]=	cPrint;
		
		Reader cReader = new Reader(theHandlern);
		
		// endless user input
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your Command: ");
			String string = scanner.nextLine();
			cReader.interpretCommand(string);
		}
		
	}

}
