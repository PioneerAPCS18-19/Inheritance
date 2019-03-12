
public class Runner 
{
	public static void main(String[] args)
	{
		Car c = new Car("Tesla");
		Car c1 = new Car(4, "Tesla");
		Motorcycle m = new Motorcycle("Ducati");
		Vehicle v = new Vehicle(4, "Toyota");
		
		Panda pan = new Panda(4, "Basi");
		Parrot par = new Parrot(2, "Polly");
		
		// illegal because Animal is abstract
		// Animal a = new Animal(4, "Coco");
	}
}
