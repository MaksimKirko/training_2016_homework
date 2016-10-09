package h1.task234.models;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Stationery> stationeries;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Stationery> getStationeries() {
		return stationeries;
	}
	
	public void setStationeries(List<Stationery> stationeries) {
		this.stationeries = stationeries;
	}
	
	public Employee(String name) {
		setName(name);
		stationeries = new ArrayList<Stationery>();
	}
	
	public void addStationery(Stationery... stationery) {
		for(Stationery st : stationery) {
			stationeries.add(st);
		}	
	}
	
	public void showStationeries() {
		System.out.println("Employee's name=" + name);
		for(Stationery st : stationeries) {
			System.out.println(st.toString());
		}
	}
}
