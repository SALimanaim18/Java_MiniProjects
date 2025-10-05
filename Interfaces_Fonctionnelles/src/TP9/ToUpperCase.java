package TP9;

import java.util.function.UnaryOperator;

public class ToUpperCase implements UnaryOperator<String> {

	@Override
	public String apply(String s) {
		
		return  s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	
	}
 
}
