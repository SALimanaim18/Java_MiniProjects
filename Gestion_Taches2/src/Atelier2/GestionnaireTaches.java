package Atelier2;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireTaches {
    private List<Tache> listeTaches;

    public GestionnaireTaches() {
        this.listeTaches = new ArrayList<>();
    }

    public void ajouterTache(Tache tache) {
        listeTaches.add(tache);
    }

    public void supprimerTache(int index) {
        if (index >= 0 && index < listeTaches.size()) {
            listeTaches.remove(index);
        } else {
            System.out.println("Index invalide.");
        }
    }

    public void afficherTaches() {
        for (Tache t : listeTaches) {
            t.afficher();
        }
    }

    public void afficherTachesRestantes() {
        for (Tache t : listeTaches) {
            if (!t.estEnRetard()) {
                t.afficher();
            }
        }
    }

    public void afficherTachesRealisees() {
        for (Tache t : listeTaches) {
            if (t.isRealisee()) {
                t.afficher();
            }
        }
    }

    public void afficherTachesEnRetard() {
        for (Tache t : listeTaches) {
            if (t.estEnRetard()) {
                t.afficher();
            }
        }
    }
}

