package TP12;

public class MyMap<T,U> {

	T[] tabkeys;
	U[] tabvalues;
	int index=0;
	public MyMap() {
		tabkeys=(T[]) new Object[10];
		tabvalues=(U[]) new Object[10];
	}
	public void add (T key, U value) {
		tabkeys[index]=key;
		tabvalues[index]=value;
	      index=index+1;  
	}
	public void get(int index) {
		System.out.println(tabkeys[index]+","+tabvalues[index]);
	}
	public int length() {
		return index;
	}
	public static void main(String args[]) {
	MyMap<Integer,String> a=new MyMap<>();
	
	//System.out.println(a.length());
	a.add(1,"C");
	a.add(2,"D");
	a.add(3,"V");

	   for (int i = 0; i < a.length(); i++) {
			
		   a.get(i);
		
			
		}
	  
    System.out.println(a.length());
}
}
