import java.util.Stack;

public class Ldc implements Handlern
{
	private Stack<String> stack;
	public Ldc(Stack<String> stack)
	{
		this.stack=stack;
	}
	public boolean InCommand(String command)
	{
		String[] parts = command.split(" ");
		if (parts[0].equals("Ldc"))
		{
			stack.push(parts[1]);
			//System.out.println("Push"+parts[1]);
			return true; 
		}
		return false ;
	}
}
