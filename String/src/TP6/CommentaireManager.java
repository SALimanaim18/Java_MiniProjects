package TP6;
public class CommentaireManager {
    private StringBuilder texteCommentaires;

    public CommentaireManager() {
        this.texteCommentaires = new StringBuilder();
    }


    public void ajouterCommentaire(String auteur, String commentaire) {
        texteCommentaires.append(auteur).append(" a dit : ").append(commentaire).append("\n");
    }

    public void supprimerCommentaire(int index) {
        int endIndex = texteCommentaires.indexOf("\n", index);
        if (endIndex != -1) {
            texteCommentaires.delete(index, endIndex + 1);
        }
    }

    // 3. Retourne tous les commentaires
    public String afficherTousLesCommentaires() {
        return texteCommentaires.toString();
    }

    public void remplacerMotDansTous(String ancienMot, String nouveauMot) {
        int index = texteCommentaires.indexOf(ancienMot);
        while (index != -1) {
            texteCommentaires.replace(index, index + ancienMot.length(), nouveauMot);
            index = texteCommentaires.indexOf(ancienMot, index + nouveauMot.length());
        }
    }

    public void inverserCommentaire(int index) {
        int endIndex = texteCommentaires.indexOf("\n", index);
        if (endIndex != -1) {
            String original = texteCommentaires.substring(index, endIndex);
            String reversed = new StringBuilder(original).reverse().toString();
            texteCommentaires.replace(index, endIndex, reversed);
        }
    }

    public int nombreTotalDeCommentaires() {
        int count = 0;
        int index = 0;
        while ((index = texteCommentaires.indexOf("\n", index)) != -1) {
            count++;
            index++;
        }
        return count;
    }

    public void viderCommentaires() {
        texteCommentaires.setLength(0);
    }
}

