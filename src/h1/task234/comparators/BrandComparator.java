package h1.task234.comparators;

import java.util.Comparator;
import h1.task234.models.Stationery;

public class BrandComparator implements Comparator<Stationery> {
	public int compare(Stationery a, Stationery b) {

		return a.getBrand().compareTo(b.getBrand());
	}
}
