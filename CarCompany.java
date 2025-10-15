interface Engine{     // Loose coupling 
	void getStart();
	static Engine provideEngine(String engine) {
		if("petrol".equalsIgnoreCase(engine))
		{
			return new PetrolEngine();
		}
		else
		{
			return new DieselEngine();
		}
	}
}
class PetrolEngine implements Engine{
	public void getStart()
	{
		System.out.println("petrol engine started.....");
	}
}
class DieselEngine implements Engine{
	public void getStart()
	{
		System.out.println("diesel engine started.....");
	}
}
class Car{
	Engine e;
	Car(Engine e)
	{
		this.e = e; 
	}
	void startMoving()
	{
		e.getStart();
		System.out.println("car is moving....");
	}
	
}
public class CarCompany{
	public static void main(String args[]) {
    Engine e = Engine.provideEngine("diesel");
	Car c = new Car(e);
	c.startMoving();
	}
}
