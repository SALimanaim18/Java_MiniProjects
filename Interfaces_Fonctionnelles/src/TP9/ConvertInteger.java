package TP9;
import java.util.function.UnaryOperator;
public class ConvertInteger implements UnaryOperator<Integer> {

	@Override
	public Integer apply(Integer t) {
		if(t>0) {
		  return -t;}
		else return t;
       // return Integer.parseInt(new StringBuilder(String.valueOf(t)).reverse().toString());
	}

}
