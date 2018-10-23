package Lab11;

public class UsedCar extends Car {
	
	private double mileage;

	public UsedCar(double mileage) {
		super();
		this.mileage = mileage;
	}

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return super.toString() + String.format("(Used) %-10s", mileage);
	}
	
	
}
