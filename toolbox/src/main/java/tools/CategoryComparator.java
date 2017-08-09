package tools;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Tool> {
	public int compare(Tool n1, Tool n2) {
		return n1.getCategory().compareTo(n2.getCategory());
	}
}
