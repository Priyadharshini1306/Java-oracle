class runtime{
	private static runtime r = new runtime();
	private runtime()
	{
		
	}
	public static runtime getInstance()
	{
		return r;
	}
	
	
}
public class Singleton {
	public static void main(String args[])
	{
		runtime r = runtime.getInstance();
		System.out.println(r);
	}

}
