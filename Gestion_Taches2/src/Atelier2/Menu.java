package Atelier2;

import java.util.Scanner;

public class Menu {
    private static GestionnaireTaches gestionnaire = new GestionnaireTaches();
    private static Scanner scanner = new Scanner(System.in);

    public static void afficherMenu() {
        System.out.println("\n1. Ajouter une tâche");
        System.out.println("2. Supprimer une tâche");
        System.out.println("3. Afficher toutes les tâches");
        System.out.println("4. Afficher les tâches restantes");
        System.out.println("5. Afficher les tâches réalisées");
        System.out.println("6. Afficher les tâches en retard");
        System.out.println("0. Quitter");
        System.out.print("Choix: ");
    }

    public static void main(String[] args) {
        boolean quitter = false;
        while (!quitter) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterTache();
                    break;
                case 2:
                    supprimerTache();
                    break;
                case 3:
                    gestionnaire.afficherTaches();
                    break;
                case 4:
                    gestionnaire.afficherTachesRestantes();
                    break;
                case 5:
                    gestionnaire.afficherTachesRealisees();
                    break;
                case 6:
                    gestionnaire.afficherTachesEnRetard();
                    break;
                case 0:
                    quitter = true;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    private static void ajouterTache() {
        System.out.print("Titre de la tâche: ");
        String titre = scanner.nextLine();
        System.out.print("Date d'échéance (YYYY-MM-DD): ");
        String dateEcheance = scanner.nextLine();
        Tache nouvelleTache = new Tache(titre, dateEcheance);
        gestionnaire.ajouterTache(nouvelleTache);
    }

    private static void supprimerTache() {
        System.out.print("Indice de la tâche à supprimer: ");
        int indice = scanner.nextInt();
        gestionnaire.supprimerTache(indice);
    }
}
