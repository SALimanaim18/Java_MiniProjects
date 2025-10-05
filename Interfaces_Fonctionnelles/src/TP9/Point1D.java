package TP9;

public class Point1D implements Affichage,Identity {
    String nom,x;

	
   public Point1D(String nom, String x) {
	   this.nom = nom;
       this.x = x;
	}



@Override
public void accept(Point1D p) {
	System.out.println(p.nom);
}



@Override
public Boolean apply(Point1D t, Point1D u) {

	return t.x==u.x;
}

}
