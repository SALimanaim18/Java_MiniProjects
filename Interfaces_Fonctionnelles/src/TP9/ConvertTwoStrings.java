package TP9;

import java.util.function.BinaryOperator;

public class ConvertTwoStrings implements BinaryOperator<String> {

	@Override
	public String apply(String t, String p) {
		
		return t+" "+p;
	}

}
