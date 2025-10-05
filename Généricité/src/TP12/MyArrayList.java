package TP12;

import java.util.ArrayList;

public class MyArrayList<T> {
	//sans genericité------------------------------------------------------------------------------
	
//	 Object[] a;  // Utilisation de Object pour remplacer la généricité
//	    private int size = 0;
//
//	    public MyArrayList() {
//	        a = new Object[10]; // Taille initiale du tableau
//	    }
//
//	    public void add(Object o) {
//	        if (size == a.length) {
//	            Object[] newArray = new Object[a.length * 2];
//	            a = newArray;
//	        }
//	        a[size] = o;
//	        size = size + 1;
//	    }
//
//	    public int length() {
//	        return size;
//	    }
//
//	    public Object get(int index) {
//	        return a[index];
//	    }
//
//	    public static void main(String args[]) {
//	        // Liste de Strings
//	        MyArrayList a = new MyArrayList();
//	        a.add("C");
//	        a.add("D");
//	        a.add("V");
//	        a.add("DD");
//	        a.add("SS");
//
//	        String s1 = "";
//	        for (int i = 0; i < a.length(); i++) {
//	            s1 = s1 + (String) a.get(i); // Cast nécessaire car on a Object
//	        }
//	        System.out.println(s1);
//
//	        // Liste d'Integers
//	        MyArrayList b = new MyArrayList();
//	        b.add(1);
//	        b.add(1);
//	        b.add(6);
//	        b.add(1);
//
//	        int s2 = 0;
//	        for (int i = 0; i < b.length(); i++) {
//	            s2 = s2 + (Integer) b.get(i); // Cast nécessaire car on a Object
//	        }
//	        System.out.println(s2);
//	    }
	
	//avec genericité------------------------------------------------------------------------------
	T[] a= (T[]) new Object[10];
    private int size=0; 
	
//	public MyArrayList() {
//	     this.size=0;
//		 a= (T[]) new Object[10];
//		
//	}	   

	 public void add(T o) {
		
	        if (size == a.length) {
	            T[] newArray = (T[])new Object[a.length * 2]; 
	            System.arraycopy(a, 0, newArray, 0, a.length); 
	            a = newArray; 
	        }
	        a[size] = o; 
	        size=size+1;  
	    }

	
	public int length() {
		return size;
	}
	public  T get(int index) {
		return a[index];
	}
	public static void main(String args[]) {
		
		MyArrayList<String> a=new MyArrayList<>();
		
		//System.out.println(a.length());
		a.add("C");
		a.add("D");
		a.add("V");
		a.add("DD");
		a.add("SS");
	String s1="";
		   for (int i = 0; i < a.length(); i++) {
				
				
				s1=s1+a.get(i);
			}
		   System.out.println(s1);
		MyArrayList<Integer> b=new MyArrayList<>();
		b.add(1);
		b.add(1);
		b.add(6);
		b.add(1);
		b.add(1);
		b.add(1);
		b.add(1);
		b.add(1);
		int s2=0;
        for (int i = 0; i < b.length(); i++) {
			
			s2=s2+b.get(i);
		}
		System.out.println(s2);
		
	}
}
