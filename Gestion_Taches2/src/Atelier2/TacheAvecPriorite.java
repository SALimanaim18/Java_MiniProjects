package Atelier2;

public class TacheAvecPriorite extends Tache {
    public static final int PRIORITE_HAUTE = 1;
    public static final int PRIORITE_MOYENNE = 2;
    public static final int PRIORITE_BASSE = 3;
    
    private int priorite;

    public TacheAvecPriorite(String titre, String dateEcheance, int priorite) {
        super(titre, dateEcheance);
        this.priorite = priorite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Priorité : " + priorite);
    }
}
