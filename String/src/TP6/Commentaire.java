package TP6;

public class Commentaire {
    private String auteur = "Inconnu";
    private String texte = "";

    public Commentaire(String auteur, String texte) {
        if (auteur != null) {
            this.setAuteur(auteur);
        }
        if (texte != null) {
            this.texte = texte;
        }
    }
	public int longueurCommentaire() {
    	return getTexte().length();
    }
	String getTexte() {
		return texte;
	}
	void setTexte(String texte) {
		this.texte = texte;
	}
	public int nombreDeMots() {
		
		return getTexte().trim().split("\\s").length;
	}
	public boolean contientMot(String mot) {
		return getTexte().contains(mot);
	}
	public String extraireSousChaine(int debut, int fin) {
		return getTexte().substring(debut, fin);
	}
	String CapitaliserPremierMot() {
        if (texte.isEmpty()) return texte;
        String[] phrases = texte.split("(?<=[.!?])\\s*");
        if (phrases.length > 0) {
            String premierMotCapitalise = Character.toUpperCase(phrases[0].charAt(0)) + phrases[0].substring(1);
            return premierMotCapitalise + texte.substring(phrases[0].length());
        }
        return texte;
    }

    public String commentaireEnMajuscules() {
        return texte.toUpperCase();
    }

    public String commenterAnonymement() {
        return "Anonyme a dit : " + texte;
    }

    public String remplacerMot(String ancienMot, String nouveauMot) {
        return texte.replace(ancienMot, nouveauMot);
     
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
    
	
	
}


