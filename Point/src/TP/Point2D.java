package TP;

public class Point2D extends Point1D{
   private int y;
   
   public Point2D(String n, int x, int y) {
	   super(n,x);
	   this.setY(y);
   }
   public Point2D( String n) {
	 
	   this(n,0,0);
   } 
   public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override 
   public String toString() {
	  
	  return this.getNom()+"("+this.getX()+","+this.getY();
	   
   }
   public double calculerDistance() {
	   return Math.sqrt(Math.pow(this.getX(),2)+ Math.pow(this.getY(),2));
   }
   
}
