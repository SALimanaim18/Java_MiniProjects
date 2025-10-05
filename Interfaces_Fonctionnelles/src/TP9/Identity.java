package TP9;

import java.util.function.BiFunction;

public interface Identity extends BiFunction<Point1D,Point1D,Boolean>
{
    public default boolean estIdentique(Point1D p,Point1D p2) {
		return p.nom==p2.nom && p.x==p2.x;
    	
    }
   
}
