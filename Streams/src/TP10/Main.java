package TP10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    	System.out.println("------------ex1-------------");
    	System.out.println("--------Etape1:");
    	List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	l.stream().forEach(System.out::println);
    	
    	System.out.println("--------Etape2:");
       	l.stream().filter(n->n%2==0).forEach(System.out::println);
       	
    	System.out.println("--------Etape3:");
      	l.stream().map(n->n*2).filter(n->n%2==0).forEach(System.out::println);
      	
    	System.out.println("--------Etape4:");
    	List<Integer> list=l.stream().map(n->n*2).filter(n->n%2==0).collect(Collectors.toList());
    	System.out.println(list);

    	Set<Integer> set=l.stream().map(n->n*2).filter(n->n%2==0).collect(Collectors.toSet());
    	System.out.println(set);

    	System.out.println("--------Etape5:");
    	int sum=l.stream().map(n->n*2).filter(n->n%2==0).reduce(0,(n,p)->n+p);
    	System.out.println(sum);
    
    	int min=l.stream().map(n->n*2).filter(n->n%2==0).reduce(Integer.MAX_VALUE,(n,p)->n>p?n:p);
    	System.out.println(min);
    	System.out.println("------------ex2-------------");
    	List<Integer> l2=Arrays.asList(12,7,19,4,21,8,3,10,14,5);
    	System.out.println("--------Q1:");
    	l2.stream().filter(n->n%2==1).forEach(System.out::println);
    	
    	System.out.println("--------Q2:");
    	int op=l2.stream().filter(n->n%2==1).map(n->n*n).reduce((n,p)->n+p).orElse(0);
    	System.out.println(op);
    	
    	System.out.println("--------Q3:");
        int op2=l2.stream().filter(n->n%2==1).map(n->n*n).filter(n->n<100).reduce(0,(n,p)->n>p?n:p);
        System.out.println(op2);
        
    	
    	System.out.println("--------Q4:");
    	List<Integer>ll=l2.stream().filter(n->n>10).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ll);
        
        System.out.println("--------Q5:");
        int ptit=l2.stream().map(n->n*n).filter(n->n%2==1).min(Integer::compare).orElse(0);
        System.out.println(ptit);
        
        Integer[] tab= {1,3,5};
        Stream<Integer> ss=Arrays.stream(tab);
        
        System.out.println(ss);
        
        System.out.println("--------Ex3:");
        try {
        	
        	Stream<String>stream=Files.lines(Path.of("D:\\server.conf.txt"));
        	stream.filter(s->!s.isEmpty())
        	.filter(s->!s.startsWith("#"))
        	.filter(s->!s.startsWith(";"))
        	.filter(s->!(s.split(" ").length==2))
        	.forEach(System.out::println);

        }catch(IOException e) {
        	System.err.println("Fich introuvable");
        }
        
        
        }
    
}
