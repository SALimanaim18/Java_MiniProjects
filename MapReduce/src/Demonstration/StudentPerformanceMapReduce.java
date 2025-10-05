package Demonstration;

import java.util.*;
import java.io.*;

public class StudentPerformanceMapReduce {

    // 🔵 Étape 1 : MAP - Convertit le CSV en paires (matière, note)
    public static List<Map.Entry<String, Integer>> map(String filePath) throws IOException {
        List<Map.Entry<String, Integer>> mappedData = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        br.readLine(); // Ignorer l'en-tête
        
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String subject = parts[1].trim(); // Matière
            int grade = Integer.parseInt(parts[2].trim()); // Note
            mappedData.add(new AbstractMap.SimpleEntry<>(subject, grade));
        }
        br.close();
        return mappedData;
    }

    // 🔵 Étape 2 : Shuffle & Sort - Regroupe les notes par matière
    public static Map<String, List<Integer>> shuffleAndSort(List<Map.Entry<String, Integer>> mappedData) {
        Map<String, List<Integer>> groupedData = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mappedData) {
            groupedData.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).add(entry.getValue());
        }
        return groupedData;
    }

    // 🔵 Étape 3 : REDUCE - Calcule la moyenne des notes par matière
    public static Map<String, Double> reduce(Map<String, List<Integer>> groupedData) {
        Map<String, Double> reducedData = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : groupedData.entrySet()) {
            double avg = entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0);
            reducedData.put(entry.getKey(), avg);
        }
        return reducedData;
    }

    // Code ANSI pour les couleurs
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m"; // Bleu ciel pour le titre
    private static final String YELLOW = "\u001B[33m"; // Jaune pour les traits
    private static final String GREEN = "\u001B[32m"; // Vert pour les matières
    private static final String WHITE = "\u001B[37m"; // Blanc pour les moyennes
    private static final String BOLD = "\u001B[1m"; // Gras pour le titre

    public static void main(String[] args) throws IOException {
        String filePath = "src\\notes_etudiants.csv"; // Fichier contenant les notes
        
        // 🔵 Exécution des étapes MapReduce
        List<Map.Entry<String, Integer>> mappedData = map(filePath);
        Map<String, List<Integer>> groupedData = shuffleAndSort(mappedData);
        Map<String, Double> reducedData = reduce(groupedData);

        // 🔵 Affichage amélioré des résultats avec style
        System.out.println(CYAN + BOLD + "\n=== Moyenne des notes par matière ===" + RESET);
        System.out.println(YELLOW + "======================================" + RESET);
        
        // Affichage des résultats avec formatage
        for (Map.Entry<String, Double> entry : reducedData.entrySet()) {
            String subject = entry.getKey();
            double average = entry.getValue();
            // Affichage des matières en vert et des moyennes en blanc
            System.out.printf("%s%-15s : %s%.1f%s\n", GREEN, subject, WHITE, average, RESET);
        }
        
        System.out.println(YELLOW + "======================================" + RESET);
    }
}
