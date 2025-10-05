package TP10;

import java.io.Serializable;

public class Personne implements Serializable{

	String nom;
	transient int age;
	public Personne(String nom,int age) {
		this.nom=nom;
		this.age=age;
	}
}
