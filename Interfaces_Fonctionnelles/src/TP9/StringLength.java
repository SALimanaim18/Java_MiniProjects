package TP9;

import java.util.function.Consumer;

public class StringLength implements Consumer<String>{
	 @Override
	    public void accept(String s) {
	        System.out.println( s.length());
	    }
}
