package TP9;

import java.util.function.Consumer;

@FunctionalInterface
public interface Affichage extends Consumer<Point1D>{
    public default void Point1D(Point1D p) {
      System.out.println(p.nom+p.x);
    };
}
