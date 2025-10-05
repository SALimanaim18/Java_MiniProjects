package Atelier2;

public class TacheAssignee extends Tache implements Affectable {
    private String personne;

    public TacheAssignee(String titre, String dateEcheance, String personne) {
        super(titre, dateEcheance);
        this.personne = personne;
    }

    @Override
    public void affecter(String personne) {
        this.personne = personne;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Assignée à : " + personne);
    }
}
