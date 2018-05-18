import java.util.Stack;

public class Print implements Handlern
{
	private Stack<String> stack;
	public Print(Stack<String> stack)
	{
		this.stack=stack;
	}
	public boolean InCommand(String command)
	{
		if (command.equals("Print"))
		{
			System.out.println(stack.pop());
			return true; 
		}
		return false ;
	}
}
