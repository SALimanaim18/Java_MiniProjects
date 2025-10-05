package TP9;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class Main {
	public static void main(String[] args) {
	/*Predicate p1=new StringEmptyFilter();
	System.out.println(p1.test("hhh"));
	Predicate p2=new IsPositif();
	System.out.println(p2.test(1));
	Predicate p3=new VerifiePow();
	System.out.println(p3.test(22));
	
	Supplier s4=new RandomInteger();
	System.out.println(s4.get());
	Supplier s5=new SaisieInteger();
	System.out.println(s5.get());
	Consumer c6=new StringLength();
	c6.accept("sss");
	Consumer c7=new CreateFile();
	c7.accept("salii.txt");	
    UnaryOperator u8=new ConvertInteger();
	System.out.println(u8.apply(34));
    UnaryOperator u9=new ToUpperCase();
    System.out.println(u9.apply("salima"));
	BinaryOperator b10 =new ConvertTwoStrings();
    System.out.println(b10.apply("salima","naim"));
	Function<String, String[]> f11 =new SplitString();
	
	  String[] result = f11.apply(("salima,naim"));

      // Affichage du résultat
      for (String word : result) {
          System.out.println(word);
      }
			
	Point1D p1=new Point1D("salima","naim");
	p1.accept(p1);
	Point1D pp2=new Point1D("mav","na");
	Point1D pp3=new Point1D("mav","na");
	System.out.println(pp2.estIdentique(pp2,pp3));*/
		
		
		

		
	/*Predicate<String> isEmpty = s ->  s.isEmpty();
	System.out.println(isEmpty.test("v"));
	Predicate<String> isEmptyMethodReference = String::isEmpty;
	Predicate<Integer> isPositif=i->i>0;
	System.out.println(isPositif.test(2));
	Predicate<Integer> verifPow = i -> Math.pow(i, 2) > 48;
	System.out.println(verifPow.test(3));
	Supplier<Integer> inputIntegerLambda = () -> {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Entrer entier: ");
	    return scanner.nextInt();
	    
	};
	//System.out.println(inputIntegerLambda.get());
	Supplier<Integer> randomInteger = () -> new Random().nextInt();
	System.out.println(randomInteger.get());
	Supplier<Integer> randomInteger2 =  new Random()::nextInt;
	System.out.println(randomInteger2.get());
	Consumer<String> stringLengthLambda = s -> System.out.println(s.length());
	stringLengthLambda.accept("s");
	Consumer c7=(t)->{File f=new File((String) t);
	
		try {
			if(f.createNewFile())
			  System.out.println("fichier créer"+ f.getName());
			else 
			    System.out.println("Le fichier existe déjà.");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        
                    };
    c7.accept("C:\\Users\\naim SALIMA\\Downloads\\Naim_Salima_G4_Centre\\saliiima.txt");
	UnaryOperator<Integer> u8=(t)->t>0?-t:t;
	System.out.println(	u8.apply(11));
	UnaryOperator<String> u9=s->s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
	System.out.println(u9.apply("salima"));
	BinaryOperator<String> b10=(s,p)->s+" "+p;
	System.out.println(b10.apply("salima","naim"));;
	Function<String,String[]> f11=s->s.split(",");
	String[] f=f11.apply("salima,nn");
	for(String v: f) {
		   System.out.println(v);
	}
	
	Comparator<Integer> comp= (a,b)->a.compareTo(b);
	System.out.println(	comp.compare(1, 4));
	Runnable runy=() -> System.out.println("Hello, world!");
	runy.run();
		

	Affichage p1=s->System.out.println(s.nom+s.nom);
	Point1D pp=new Point1D("sa"," na");
	p1.accept(pp);
	ArrayList<Point1D> t=new ArrayList<Point1D>();
	Point1D pp2=new Point1D("li"," na");
	Point1D pp3=new Point1D("ma"," na");
    t.add(pp3);
    t.add(pp2);
    t.add(pp);
    for(Point1D p:t) {
    	p1.accept(p);
    }
		Point1D pp2=new Point1D("mav","na");
		Point1D pp3=new Point1D("ma","na");
		Identity i=(ppp,pp)->ppp.x==pp.x;
		System.out.println(i.apply(pp2,pp3));
		ArrayList<Integer> t=new ArrayList<Integer>();
		t.add(1);
	    t.add(4);
	    t.add(7);
	    for(Integer p:t) {
	    	System.out.println(toLong(p)+78);
	    }
		
}
	
	public static Long toLong(int v) {
		return (long)v;
		*/
	}

}
