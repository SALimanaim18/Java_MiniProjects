package TP8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
	HashSet<Etudiant> Etudiants=new HashSet<>();
	Etudiant E1=new Etudiant("1","salima",11);
	Etudiant E2=new Etudiant("2","aya",12);
	Etudiant E3=new Etudiant("1","safaa",112);
	Etudiant E4=new Etudiant("1","imane",11);
	Etudiant E5=new Etudiant("3","wissal",12);
	System.out.println(Etudiants.add(E1));
	System.out.println(Etudiants.add(E2));
	System.out.println(Etudiants.add(E3));
	System.out.println(Etudiants.add(E4));
	System.out.println(Etudiants.add(E5));
	for(Etudiant Etudiant:Etudiants) {
		System.out.println(Etudiant);
	}

	
	TreeSet<Etudiant> TriEtudiants=new TreeSet<>(Comparator.reverseOrder());
	TriEtudiants.addAll(Etudiants);

	Iterator it=TriEtudiants.iterator();
	while(it.hasNext()) {
		System.out.println( it.next());
	}
	
}
}