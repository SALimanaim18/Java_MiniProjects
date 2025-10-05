package TP8;

public class Etudiant implements Comparable<Etudiant>{
	String cin,nom;
	int anneeDeNaissance;
	public Etudiant(String cin, String nom, int anneeDeNaissance) {
		this.cin=cin;
		this.nom=nom;
		this.anneeDeNaissance=anneeDeNaissance;
	}
	public int hashCode() {
		return anneeDeNaissance;
	}
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null)return false;
		if(this.getClass()!=obj.getClass())return false;
		Etudiant E=(Etudiant) obj;
		return E.cin.equals(this.cin) && E.nom.equals(this.nom) ;
		
	}
	
	public String toString() {
		return this.cin+" "+this.nom+" "+this.anneeDeNaissance;
	}
  

	@Override
	public int compareTo(Etudiant E) {
		 return this.nom.compareTo(E.nom); }
	 
		
		
	}
