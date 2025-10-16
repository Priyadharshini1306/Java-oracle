class runtime{
	private static runtime r;
	private runtime()
	{
		
	}
	public static runtime getInstance()
	{
		if(r==null)
		{
			r = new runtime();
		}
		return r;
	}
}
public class Singleton_class_laze_initialization {
    public static void main(String args[])
	{
		runtime r = runtime.getInstance();
		System.out.println(r);
	}
}
