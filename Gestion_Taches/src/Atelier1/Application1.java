package Atelier1;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] taches = creerTableauTaches(10);
        boolean quitter = false;

        while (!quitter) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consomme la ligne vide après l'entier

            switch (choix) {
                case 0:
                    quitter = true;
                    break;
                case 1:
                    System.out.println("Taille du tableau initial ?");
                    int taille = scanner.nextInt();
                    taches = creerTableauTaches(taille);
                    System.out.println("Tableau initialisé.");
                    break;
                case 2:
                    System.out.println("Nouvelle tâche :");
                    String nouvelleTache = scanner.nextLine();
                    System.out.println("Date d'échéance (YYYY-MM-DD) :");
                    String date = scanner.nextLine();
                    taches = ajouterTacheAvecDate(taches, nouvelleTache, date);
                    System.out.println("Tâche ajoutée.");
                    break;
                case 3:
                    System.out.println("Nouvelle tâche :");
                    nouvelleTache = scanner.nextLine();
                    System.out.println("Date d'échéance (YYYY-MM-DD) :");
                    date = scanner.nextLine();
                    System.out.println("Emplacement où insérer la tâche :");
                    int emplacement = scanner.nextInt();
                    taches = ajouterTacheAEmplacement(taches, nouvelleTache, date, emplacement);
                    System.out.println("Tâche ajoutée à l'emplacement " + emplacement + ".");
                    break;
                case 4:
                    afficherTaches(taches);
                    break;
                case 5:
                    System.out.println("Indice de la tâche à marquer comme réalisée :");
                    int indice = scanner.nextInt();
                    marquerTacheCommeRealisee(taches, indice);
                    System.out.println("Tâche marquée comme réalisée.");
                    break;
                case 6:
                    afficherTachesRestantes(taches);
                    break;
                case 7:
                    afficherTachesRealisees(taches);
                    break;
                case 8:
                    System.out.println("Date d'échéance (YYYY-MM-DD) pour afficher les tâches restantes :");
                    date = scanner.nextLine();
                    String[][] tachesRetard = tachesEnRetard(taches, date);
                    afficherTaches(tachesRetard);
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
	}

    // Fonction pour afficher le menu interactif
    public static void afficherMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Initialiser la liste des tâches");
        System.out.println("2. Ajouter une nouvelle tâche à la fin du tableau");
        System.out.println("3. Ajouter une tâche à un emplacement donné");
        System.out.println("4. Afficher toutes les tâches");
        System.out.println("5. Marquer une tâche comme réalisée");
        System.out.println("6. Afficher uniquement les tâches restantes");
        System.out.println("7. Afficher uniquement les tâches réalisées");
        System.out.println("8. Afficher les tâches restantes d'une date donnée");
        System.out.println("0. Quitter");
        System.out.print("Votre choix : ");
    }

    // Partie 1 : Fonction pour créer un tableau à une dimension
    public static String[] creerTableauSimple(int taille) {
        return new String[taille];  // Tableau simple pour stocker les titres des tâches
    }

    // Partie 1 : Fonction pour ajouter une tâche à la fin du tableau à une dimension
    public static String[] ajouterTacheSimple(String[] taches, String nouvelleTache) {
        int indexLibre = -1;

        for (int i = 0; i < taches.length; i++) {
            if (taches[i] == null) {
                indexLibre = i;
                break;
            }
        }

        if (indexLibre != -1) {
            taches[indexLibre] = nouvelleTache;
        } else {
			String[] nouveauTableau = creerTableauSimple (taches.length + 10);
            copierTachesSimple(taches, nouveauTableau);
            nouveauTableau[taches.length] = nouvelleTache;
            return nouveauTableau;
        }

        return taches;
    }
	public static void copierTachesSimple ( String[] tachesA, String[] tachesB ) {
		
		for (int i=0; i<tachesA.length; i++)
			tachesB[i] = tachesA[i];
	}
    // Partie 1 : Fonction pour afficher les tâches dans le tableau à une dimension
    public static void afficherTachesSimple(String[] taches) {
        for (int i = 0; i < taches.length; i++) {
            if (taches[i] != null) {
                System.out.println(i + ". " + taches[i]);
            }
        }
    }

    // Partie 1 : Fonction pour ajouter une tâche à un emplacement spécifique dans le tableau à une dimension
    public static String[] ajouterTacheAEmplacementSimple(String[] taches, String nouvelleTache, int emplacement) {
        if (emplacement < 0 || emplacement >= taches.length) {
            System.out.println("Emplacement invalide !");
            return taches;
        }

        if (taches[emplacement] == null) {
            taches[emplacement] = nouvelleTache;
        } else {
            String[] nouveauTableau = new String[taches.length + 10];
            System.arraycopy(taches, 0, nouveauTableau, 0, taches.length);
            System.arraycopy(nouveauTableau, emplacement, nouveauTableau, emplacement + 1, taches.length - emplacement);
            nouveauTableau[emplacement] = nouvelleTache;
            return nouveauTableau;
        }

        return taches;
    }

    // Partie 2 : Fonction pour créer un tableau à trois colonnes
    public static String[][] creerTableauTaches(int taille) {
        return new String[taille][3];  // Tableau de trois colonnes : [Titre, Etat, Date d'échéance]
    }

    // Partie 2 : Fonction pour copier un tableau dans un autre
    public static void copierTaches(String[][] source, String[][] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i][0] = source[i][0];
            destination[i][1] = source[i][1];
            destination[i][2] = source[i][2];
        }
    }

    // Partie 2 : Ajouter une tâche avec une date d'échéance
    public static String[][] ajouterTacheAvecDate(String[][] taches, String nouvelleTache, String date) {
        int indexLibre = -1;

        for (int i = 0; i < taches.length; i++) {
            if (taches[i][0] == null) {
                indexLibre = i;
                break;
            }
        }

        if (indexLibre != -1) {
            taches[indexLibre][0] = nouvelleTache;
            taches[indexLibre][1] = "non";
            taches[indexLibre][2] = date;
        } else {
            String[][] nouveauTableau = new String[taches.length + 10][3];
            copierTaches(taches, nouveauTableau);
            nouveauTableau[taches.length][0] = nouvelleTache;
            nouveauTableau[taches.length][1] = "non";
            nouveauTableau[taches.length][2] = date;
            return nouveauTableau;
        }

        return taches;
    }

    // Partie 2 : Afficher toutes les tâches
    public static void afficherTaches(String[][] taches) {
        for (int i = 0; i < taches.length; i++) {
            if (taches[i][0] != null) {
                System.out.println(i + ". " + taches[i][0] + " - Réalisée: " + taches[i][1] + " - Date: " + taches[i][2]);
            }
        }
    }

    // Partie 2 : Ajouter une tâche à un emplacement donné
    public static String[][] ajouterTacheAEmplacement(String[][] taches, String nouvelleTache, String date, int emplacement) {
        if (emplacement < 0 || emplacement >= taches.length) {
            System.out.println("Emplacement invalide !");
            return taches;
        }

        if (taches[emplacement][0] == null) {
            taches[emplacement][0] = nouvelleTache;
            taches[emplacement][1] = "non";
            taches[emplacement][2] = date;
        } else {
            String[][] nouveauTableau = new String[taches.length + 10][3];
            copierTaches(taches, nouveauTableau);
            System.arraycopy(nouveauTableau, emplacement, nouveauTableau, emplacement + 1, taches.length - emplacement);
            nouveauTableau[emplacement][0] = nouvelleTache;
            nouveauTableau[emplacement][1] = "non";
            nouveauTableau[emplacement][2] = date;
            return nouveauTableau;
        }

        return taches;
    }

    // Partie 2 : Marquer une tâche comme réalisée
    public static void marquerTacheCommeRealisee(String[][] taches, int indice) {
        if (indice < 0 || indice >= taches.length || taches[indice][0] == null) {
            System.out.println("Indice invalide ou tâche inexistante !");
          
        }
        taches[indice][1] = "oui";
    }
    public static void marquerTacheCommeNonRealisee(String[][] taches, int indice) {
        if (indice < 0 || indice >= taches.length || taches[indice][0] == null) {
            System.out.println("Indice invalide ou tâche inexistante !");
            
        }
        taches[indice][1] = "non";
    }

    // Partie 2 : Afficher uniquement les tâches non réalisées
    public static void afficherTachesRestantes(String[][] taches) {
        for (int i = 0; i < taches.length; i++) {
            if ("non".equals(taches[i][1]) && taches[i][0] != null) {
                System.out.println(i + ". " + taches[i][0] + " - Date: " + taches[i][2]);
            }
        }
    }

    // Partie 2 : Afficher uniquement les tâches réalisées
    public static void afficherTachesRealisees(String[][] taches) {
        for (int i = 0; i < taches.length; i++) {
            if ("oui".equals(taches[i][1]) && taches[i][0] != null) {
                System.out.println(i + ". " + taches[i][0] + " - Date: " + taches[i][2]);
            }
        }
    }

    // Partie 2 : Récupérer les tâches en retard par rapport à une date donnée
    public static String[][] tachesEnRetard(String[][] taches, String dateActuelle) {
        String[][] tachesRetard = new String[taches.length][3];
        int index = 0;

        for (int i = 0; i < taches.length; i++) {
            if (taches[i][0] != null && taches[i][2].compareTo(dateActuelle) < 0 && "non".equals(taches[i][1])) {
                tachesRetard[index++] = taches[i];
            }
        }

        return tachesRetard;
    }
}
