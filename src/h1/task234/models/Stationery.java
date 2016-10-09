package h1.task234.models;

public abstract class Stationery {
	private double cost;
	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}	
	
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Stationery [cost=" + cost + ", brand=" + brand + "]";
	}
}
