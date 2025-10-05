package TP9;


import java.util.function.Function;

public class SplitString implements Function<String,String[]>{

	@Override
	public String[] apply(String t) {
	   return t.split(",");
	}

}
