
public class Car {


	private int cylinders;
	private int wheels;
	private String name;
	private boolean engine;
	public Car(int cylinders ,String name) {
		super();
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String startEngine() {
		return "Car -> startEngine()";
	}
	public String accelerate() {
		return "Car -> accelerate";
	}
	public String Brake () {
		return "Car -> carbrake()";
	}
	
	}
class Mistubushi extends Car {         

	public Mistubushi(String engine, int cylinders, int airBags, String name) {
		super(cylinders , name);
		// TODO Auto-generated constructor stub
	}
	
	
}
	

