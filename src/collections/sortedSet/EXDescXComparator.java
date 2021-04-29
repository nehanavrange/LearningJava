package collections.sortedSet;

import java.util.Comparator;

public class EXDescXComparator implements Comparator<EX> {

	@Override
	public int compare(EX o1, EX o2) {
		
		return o2.getX() - o1.getX() ;
	}

}
