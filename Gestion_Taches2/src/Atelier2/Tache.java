package Atelier2;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;

public class Tache {
    protected final String titre;
    protected boolean realisee;
    protected String dateEcheance;
    private static int compteurTaches = 0;

    public Tache(String titre, String dateEcheance) {
        this.titre = titre;
        this.dateEcheance = dateEcheance;
        this.realisee = false;
        compteurTaches++;
    }

    public final void marquerRealisee() {
        this.realisee = true;
    }

    public final void marquerNonRealisee() {
        this.realisee = false;
    }

    public boolean estEnRetard() {
        //LocalDate dateActuelle = LocalDate.now();
       // LocalDate dateTache = LocalDate.parse(dateEcheance, DateTimeFormatter.ISO_LOCAL_DATE);
        //return !realisee && dateTache.isBefore(dateActuelle);
        String dateActuelle = "2024-10-20"; // Simule la date actuelle pour un débutant (vous pouvez demander à l'utilisateur d'entrer la date actuelle)
        return !realisee && dateEcheance.compareTo(dateActuelle) < 0;

    }

    public void afficher() {
        String etat = realisee ? "R" : " ";
        System.out.println(etat + " - " + dateEcheance + " - " + titre);
    }

    public static int getCompteurTaches() {
        return compteurTaches;
    }

    public static void afficherCompteurTaches() {
        System.out.println("Nombre total de tâches créées : " + compteurTaches);
    }

    @Override
    public String toString() {
        return "Tache{" +
                "titre='" + titre + '\'' +
                ", realisee=" + realisee +
                ", dateEcheance='" + dateEcheance + '\'' +
                '}';
    }
    // Getter pour 'titre'
    public String getTitre() {
        return titre;
    }

    // Getter et setter pour 'realisee'
    public boolean isRealisee() {
        return realisee;
    }

    public void setRealisee(boolean realisee) {
        this.realisee = realisee;
    }

    // Getter et setter pour 'dateEcheance'
    public String getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(String dateEcheance) {
        this.dateEcheance = dateEcheance;
    }
}

