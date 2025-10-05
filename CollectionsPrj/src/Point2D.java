
public class Point2D implements Comparable<Point2D> {

	int x, y;
	
	public Point2D( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		return x;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if (this == obj) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		
		Point2D p = (Point2D) obj;
		
		return p.x == this.x && p.y==this.y ;
	}
	
	public int compareTo(Point2D p) {
		
		// retourner > 0 si this > p
		if ( this.x > p.x ) return 1;
		else if ( this.x < p.x ) return -1;
		else {
			
			if (this.y > p.y ) return 1;
			else if (this.y < p.y) return -1;
			else return 0;
		}
		
		/*int resultat = this.x - p.x;
		if (resultat != 0) return resultat;
		else 
			return this.y - p.y; */
		
		// retourner < 0 si this < p
		// retourner 0 si this 9AD p
	}
	
	@Override
	public String toString() {
		return "Point2D(" + x + ", " + y + ")";
	}
	
}
