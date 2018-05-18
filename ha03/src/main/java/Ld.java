import java.util.Stack;

public class Ld implements Handlern
{
	private VarX x; 
	private Stack<String> stack;
	public Ld(Stack<String> stack,VarX x)
	{
		this.stack=stack;
		this.x=x;
	}
	public boolean InCommand(String command)
	{
		if (command.equals("Ld"))
		{
			stack.push(this.x.getX());
			//System.out.println("Ld"+this.x);
			return true; 
		}
		return false ;
	}
}
