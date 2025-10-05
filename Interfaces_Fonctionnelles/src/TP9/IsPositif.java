package TP9;

import java.util.function.Predicate;

public class IsPositif implements Predicate<Integer>{
	@Override
    public boolean test(Integer i) {
        return i > 0;
    }
}
