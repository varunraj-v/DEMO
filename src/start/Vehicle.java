package start;

public class Vehicle implements Comparable<Vehicle>{
	private int id;
	private String type;
	private String brand;
	private int year;
	public int getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getBrand() {
		return brand;
	}
	public int getYear() {
		return year;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Vehicle(int id, String type, String brand, int year) {
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.year = year;
	}
	
	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub	
		return this.year-o.year;
	}
	@Override
	public String toString() {
		return "Vehicle id=" + id + ", type=" + type + ", brand=" + brand + ", year=" + year + " ";
	}
	
	

}
