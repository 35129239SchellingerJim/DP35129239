import java.util.Stack;

public class Mult implements Handlern
{
	private Stack<String> stack;
	public Mult(Stack<String> stack)
	{
		this.stack=stack;
	}
	public boolean InCommand(String command)
	{
		if (command.equals("Mult"))
		{
			String s1 = stack.pop();
			String s2 = stack.pop();
			//stack.push(s2);
			//stack.push(s1);
			int y=Integer.parseInt(s1)*Integer.parseInt(s2);
			stack.push(Integer.toString(y));
			//System.out.println("Mult");
			return true; 
		}
		return false ;
	}
}

