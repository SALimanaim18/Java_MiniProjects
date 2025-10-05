package TP9;

import java.util.function.Predicate;

public class VerifiePow implements Predicate<Integer> {
	  @Override
	    public boolean test(Integer i) {
	        return Math.pow(i,2) > 48;
	    }
}
