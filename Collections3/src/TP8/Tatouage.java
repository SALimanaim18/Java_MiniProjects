package TP8;

public class Tatouage  {
	
	    String espece;
	    int identifiant;

	    public Tatouage(String espece, int identifiant) {
	        this.espece = espece;
	        this.identifiant = identifiant;
	    }
	    public String toString() {
			return espece+ " "+ identifiant;
		}
}
