package TP9;

import java.util.function.Predicate;

public class StringEmptyFilter 

	implements Predicate<String>{
		@Override
		public boolean test(String c) {
			if(c.isEmpty()) {
				return true;
			}
			return false;
		}
	
	}

