package h1.task234.models;

import java.util.ArrayList;
import java.util.List;

public class NewbieSet {
	private List<Stationery> stationeries;
	
	public List<Stationery> getStationeries() {
		return stationeries;
	}
	
	public void setStationeries(List<Stationery> stationeries) {
		this.stationeries = stationeries;
	}
	
	public NewbieSet() {
		stationeries = new ArrayList<Stationery>();
		
	}
	
	public void addStationery(Stationery... stationery) {
		for(Stationery st : stationery) {
			stationeries.add(st);
		}	
	}
	
	public void showStationeries() {
		for(Stationery st : stationeries) {
			System.out.println(st.toString());
		}
	}
}
