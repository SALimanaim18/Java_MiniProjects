package TP3;

public class Application {
	public static void main(String[] args) {
		int integerValue=100;
		Integer i=Integer.valueOf(integerValue);
		double doubleValue=i;
		Integer intWrapper=10;
		//intWrapper.intValue();
		Double doubleWrapper=Double.valueOf(intWrapper);
		doubleWrapper.intValue();
		System.out.println(integerValue);
		System.out.println(i);
		System.out.println(doubleValue);
		System.out.println(intWrapper);
		System.out.println(doubleWrapper);
		String s="250";
		System.out.println(Integer.parseInt(s));
		System.out.println(Integer.valueOf(s));	
		String s1=intWrapper.toString();
		System.out.println(s1);
		//System.out.println(intWrapper.getClass().getSimpleName());
		Integer nullInteger=null;
		
		if (nullInteger!=null) {
			int nullI=nullInteger;
			System.out.println(nullI);
		}
		else System.out.println(nullInteger);
		double largeDouble=12345.678;
		int lgD=(int)largeDouble;
		System.out.println(lgD);
		Integer i1=200;
		Integer i2=200;
	
		if(i1.equals(i2)) {
			System.out.println("sont egaux");
			
		} else System.out.println("ne sont pas egaux");
	}

}
