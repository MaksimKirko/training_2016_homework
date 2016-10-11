package h1.task234.comparators;

import java.util.Comparator;
import h1.task234.models.Stationery;

public class CostComparator implements Comparator<Stationery> {
	public int compare(Stationery a, Stationery b) {
		if (a.getCost() > b.getCost())
			return 1;
		else if (a.getCost() < b.getCost())
			return -1;
		else
			return 0;
	}
}
