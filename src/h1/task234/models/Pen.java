package h1.task234.models;

public class Pen extends Stationery {
	private double inkAmount;

	public double getInkAmount() {
		return inkAmount;
	}
	
	public void setInkAmount(double inkAmount) {
		this.inkAmount = inkAmount;
	}
	
	public Pen(String brand) {
		setInkAmount(100);
		setBrand(brand);
		setCost(30);
	}

	@Override
	public String toString() {
		return "Pen [inkAmount=" + inkAmount + ", brand=" + getBrand() + ", cost=" + getCost() + "]";
	}
}
