package TP8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
	   HashSet<Animal> animaux=new HashSet();
	   Animal A1=new Animal("shien",12);
	   Animal A2=new Animal("ahtt",2);
	   Animal A3=new Animal("chien",1);
	   boolean b1=animaux.add(A1);
	   boolean b2=animaux.add(A2);
	   boolean b3=animaux.add(A3);/*
       System.out.println(b1);
       System.out.println(b2);
       System.out.println(b3);
       System.out.println(animaux.size());
       System.out.println(A1.hashCode());
       System.out.println(A2.hashCode());
       System.out.println(A3.hashCode());
       Iterator it=animaux.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
       for(Object animal:animaux) {
   		System.out.println(animal);
   	}
       
	   TreeSet animaux=new TreeSet();
	   Animal A1=new Animal("chien",12);
	   Animal A2=new Animal("chatt",12);
	   Animal A3=new Animal("chien",12);
	   boolean b1=animaux.add(A1);
	   boolean b2=animaux.add(A2);
	   boolean b3=animaux.add(A3);
     System.out.println(b1);
     System.out.println(b2);
     System.out.println(b3);
       System.out.println(animaux.size());

       Iterator it=animaux.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
       for(Object animal:animaux) {
   		System.out.println(animal);
   	}*/
     ArrayList<Animal> a=new ArrayList(animaux);
     Collections.sort(a, (animal1, animal2) -> Integer.compare(animal1.getAge(),animal2.getAge()));
    
     System.out.println("Liste triée : " + a);
     HashMap<Tatouage,Animal> tatouages=new HashMap<>();
     tatouages.put(new Tatouage("Aigle", 1), new Animal("Aigle", 5));
     tatouages.put(new Tatouage("Aigle", 2), new Animal("Aigle", 3));
     tatouages.put(new Tatouage("Chien", 1), new Animal("Chien", 2));
     tatouages.put(new Tatouage("Chien", 2), new Animal("Chien", 4));
     Iterator<HashMap.Entry<Tatouage, Animal>> iterator = tatouages.entrySet().iterator();
     while (iterator.hasNext()) {
         HashMap.Entry<Tatouage, Animal> entry = iterator.next();
         Tatouage tatouage = entry.getKey();
         Animal animal = entry.getValue();
         System.out.println("Tatouage: " + tatouage + ", Animal: " + animal);
     }
     for (Animal animal : tatouages.values()) {
    	    System.out.println("Animal: " + animal);
    	}
	}
}
