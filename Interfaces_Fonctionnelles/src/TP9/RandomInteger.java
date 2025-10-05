package TP9;

import java.util.function.Supplier;

public class RandomInteger implements Supplier<Integer> {
	@Override
	 public Integer get() {
		
	        return (int)(Math.random()*100); 
	    }
}
