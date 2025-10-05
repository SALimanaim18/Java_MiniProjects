package TP;
import java.util.Scanner;

public class Point1D extends Point{
   protected String nom;
   protected  int x;
   static final Point1D POINT_O= new Point1D("x",0);
   public Point1D(String n, int x) {
	   this.setNom(n);
	   this.setX(x);
   }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
   public Point1D(String n) {
	   this(n,0);
   }
   public String toString() {
	   return getNom()+"("+getX()+")";
	   
   }

	@Override
   public double calculerDistance() {
	   return this.getX()- POINT_O.x;
   }
   public static void main(String[] args) {
	   Point1D POINT_O2= new Point1D("x",4);
	   POINT_O2.toString();
	   Affichage.point1d(POINT_O2);
	   Point1D POINT_O3= new Point2D("x",4,2);
	   POINT_O3.toString();
	   Affichage.point1d(POINT_O3);
	   POINT_O2.calculerDistance();
	   Point[] P= {
			   new Point1D("x",3),
			   new Point2D("x",4,3)
	   };
	   for (Point p: P ) {
		   System.out.println(p.calculerDistance());
	   }
   }
   
}
