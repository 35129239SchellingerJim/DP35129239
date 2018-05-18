import java.util.Stack;

public class Store implements Handlern
{
	private VarX x; 
	private Stack<String> stack;
	public Store(Stack<String> stack,VarX x)
	{
		this.stack=stack;
		this.x=x;
	}
	public boolean InCommand(String command)
	{
		if (command.equals("Store"))
		{
			this.x.setX(stack.pop());
			System.out.println("Store"+this.x);
			return true; 
		}
		return false ;
	}
}
