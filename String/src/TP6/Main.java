package TP6;

public class Main {
    public static void main(String[] args) {
        // Création de plusieurs commentaires
        Commentaire commentaire1 = new Commentaire("xx", "C'est un excellent produit. Je le recommande!");
        Commentaire commentaire2 = new Commentaire("vv", "Pas très satisfait de la qualité.");
        Commentaire commentaire3 = new Commentaire("nn", "Livraison rapide et service client parfait.");

        // Utilisation des méthodes de la classe Commentaire
        System.out.println("Longueur du commentaire 1: " + commentaire1.longueurCommentaire());
        System.out.println("Nombre de mots dans le commentaire 1: " + commentaire1.nombreDeMots());
        System.out.println("Commentaire 1 contient 'excellent' : " + commentaire1.contientMot("excellent"));
        System.out.println("Sous-chaîne du commentaire 2 (3-17): " + commentaire2.extraireSousChaine(3, 17));
        System.out.println("Commentaire 3 avec le premier mot capitalisé: " + commentaire3.CapitaliserPremierMot());
        System.out.println("Commentaire 1 en majuscules: " + commentaire1.commentaireEnMajuscules());
        System.out.println("Commentaire 2 anonymisé: " + commentaire2.commenterAnonymement());
        System.out.println("Commentaire 3 avec 'service' remplacé par 'support': " + commentaire3.remplacerMot("service", "support"));

        // Création de CommentaireManager pour gérer plusieurs commentaires
        CommentaireManager manager = new CommentaireManager();
        
        // Ajout de commentaires au manager
        manager.ajouterCommentaire(commentaire1.getAuteur(), commentaire1.getTexte());
        manager.ajouterCommentaire(commentaire2.getAuteur(), commentaire2.getTexte());
        manager.ajouterCommentaire(commentaire3.getAuteur(), commentaire3.getTexte());

        // Affichage de tous les commentaires
        System.out.println("\nTous les commentaires :");
        System.out.println(manager.afficherTousLesCommentaires());

        // Remplacement d'un mot dans tous les commentaires
        manager.remplacerMotDansTous("qualité", "performance");
        System.out.println("Tous les commentaires après remplacement de 'qualité' par 'performance':");
        System.out.println(manager.afficherTousLesCommentaires());

        // Inversion d'un commentaire (par exemple, le premier commentaire)
        manager.inverserCommentaire(0);
        System.out.println("Tous les commentaires après inversion du premier commentaire:");
        System.out.println(manager.afficherTousLesCommentaires());

        // Comptage du nombre total de commentaires
        System.out.println("Nombre total de commentaires: " + manager.nombreTotalDeCommentaires());

        // Suppression de tous les commentaires
        manager.viderCommentaires();
        System.out.println("Tous les commentaires après suppression:");
        System.out.println(manager.afficherTousLesCommentaires());
    }
}
