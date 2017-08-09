package tools;

import java.util.Comparator;

public class NameComparator implements Comparator<Tool>{

	public int compare(Tool n1, Tool n2) {
		return n1.getName().compareTo(n2.getName());
	}

}
