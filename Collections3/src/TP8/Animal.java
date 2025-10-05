package TP8;



public class Animal implements Comparable {
	String nom;
	int age;
	public Animal(String nom, int age) {
		this.nom=nom;
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		return getNom().length()+getAge();
	}

	@Override
	public boolean equals(Object a) {
		if(a==null || !(a instanceof Animal))return false;
		Animal animal=(Animal) a;
	 return this.getNom().equals(animal.getNom()) && this.getAge()==animal.getAge();
	
	}
	public String toString() {
		return getNom()+ " "+ getAge();
	}

	public int getAge() {
		return age;
	}

	public String getNom() {
		return nom;
	}

//	@Override
//	public int compare(Animal a1, Animal a2) {
//		if(a1.getNom().equals(a2.getNom()) && a1.getAge()==(a2.getAge()))   return 1;
//        else return -1;
//	}
	@Override
	public int compareTo(Object a) {
		if (a==null || !(a instanceof Animal))return 1;
		Animal a1=(Animal)a;
		if(a1.getNom().equals(this.getNom()) && a1.getAge()==(this.getAge()))   return 0;
		else return 1;
	}

}

