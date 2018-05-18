
public class Reader 
{
	private Handlern[] theHandlern;
	
	public Reader(Handlern[] theHandlern)
	{
		this.theHandlern =  theHandlern;//new Handlern[numCommands];
	}
	
	public boolean interpretCommand(String command)
	{
		for (Handlern h : this.theHandlern)
		{
			h.InCommand(command);
		}
		return false ;
	}
}
