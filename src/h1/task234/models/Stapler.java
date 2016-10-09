package h1.task234.models;

public class Stapler extends Stationery {
	private int clips;
	
	public int getClips() {
		return clips;
	}
	
	public Stapler(String brand) {
		setBrand(brand);
		setCost(100);
	}

	@Override
	public String toString() {
		return "Stapler [clips=" + clips + ", brand=" + getBrand() + ", cost=" + getCost() + "]";
	}
}
