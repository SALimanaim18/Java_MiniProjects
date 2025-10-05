import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Point2D p1 = new Point2D(1, 3);
		Point2D p2 = new Point2D(2, 2);
		Point2D p3 = new Point2D(1, 3);
		
		List<Point2D> liste = new ArrayList<>();
		liste.add(p2);
		liste.add(p1);
		liste.add(p3);
		System.out.println(liste);
		
		/*Collections.sort(liste);
		System.out.println(liste);*/
		
		Collections.reverse(liste);
		System.out.println(liste);
		
		System.out.println( Collections.max(liste) );
		
		
		
		/*Point2D [] tab = {p1, p3, p2};
		Arrays.sort(tab );
		for( Point2D p : tab )
			System.out.println(p);
		
		int index = Arrays.binarySearch(tab, new Point2D(2, 2));
		
		System.out.println(index);*/
		
		/*TreeSet<Point2D> treeSet = new TreeSet<>();
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		
		System.out.println(treeSet);*/
		
		/*Map<Point2D, String> map = new TreeMap(new Point2DComparator());
		map.put(p1, "test");
		map.put(p3, "test");
		map.put(p2, "test");
		
		System.out.println(map);*/

	}
}

class Point2DComparator implements Comparator<Point2D> {

	@Override
	public int compare(Point2D o1, Point2D p) {
		
		if ( o1.x > p.x ) return -1;
		else if ( o1.x < p.x ) return 1;
		else {
			
			if (o1.y > p.y ) return -1;
			else if (o1.y < p.y) return 1;
			else return 0;
		}
	}
	
}
