package TP5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
     public static void main (String[] args) {
     	 Scanner sc=new Scanner(System.in);
    	 System.out.println("entrez le nom du client");
    	 String cli=sc.nextLine();
    	 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	 System.out.println("entrez la date d'arrivée");
    	 String dA=sc.nextLine();
    	 LocalDate dateA=LocalDate.parse(dA,formatter);
    	 System.out.println("entrez la date depart");
    	 String dD=sc.nextLine();
    	 LocalDate dateD=LocalDate.parse(dD,formatter);
    	 DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("HH:mm");
    	 System.out.println("entrez l'heure d'arrivée");
    	 String hA=sc.nextLine();
    	 LocalTime heureA=LocalTime.parse(hA,formatter2);
    	 System.out.println("entrez l'heure de deppart");
    	 String hD=sc.nextLine();
    	 LocalTime heureD=LocalTime.parse(hD,formatter2);
    	 System.out.println(cli);
    	 System.out.println(dateA.format(formatter));
    	 System.out.println(dateD.format(formatter));
    	 System.out.println(heureA.format(formatter2));
    	 System.out.println(heureD.format(formatter2));
    	 

         Reservation reservation1 = new Reservation(
                 "salima",
                 LocalDate.parse("03/03/2024",formatter ),
                 LocalDate.parse("15/03/2024", formatter),
                 LocalTime.parse("08:30", formatter2),
                 LocalTime.parse("10:15", formatter2)
             );
         if (!reservation1.estValide()) {
             System.out.println("Réservation invalide. Vérifiez les dates et heures.");
             return;
         }

         System.out.println("\nAffichage de la réservation 1 :");
         System.out.println(reservation1);

         System.out.println("\nCalcul du temps avant la réservation :");
         System.out.println("Temps restant avant le check-in : " + reservation1.tempsAvantReservation().toHours() + " heures");

         System.out.println("\nDétermination de la saison d'arrivée :");
         System.out.println("Saison d'arrivée : " + SeasonUtil.determinerSaison(reservation1.getDateArrivee()));

         // Saisie d'une seconde réservation pour comparaison
         System.out.println("\nSaisie de la deuxième réservation pour comparaison :");
         System.out.print("Nom du client : ");
         String nomClient2 = sc.nextLine();
         System.out.print("Date d'arrivée (dd/MM/yyyy) : ");
         LocalDate dateArrivee2 = LocalDate.parse(sc.nextLine(), formatter);
         System.out.print("Date de départ (dd/MM/yyyy) : ");
         LocalDate dateDepart2 = LocalDate.parse(sc.nextLine(), formatter);
         System.out.print("Heure d'arrivée (HH:mm) : ");
         LocalTime heureArrivee2 = LocalTime.parse(sc.nextLine(), formatter2);
         System.out.print("Heure de départ (HH:mm) : ");
         LocalTime heureDepart2 = LocalTime.parse(sc.nextLine(), formatter2);

         Reservation reservation2 = new Reservation(nomClient2, dateArrivee2, dateDepart2, heureArrivee2, heureDepart2);
         if (!reservation2.estValide()) {
             System.out.println("Réservation invalide. Vérifiez les dates et heures.");
             return;
         }

         System.out.println("\nComparaison des durées de séjour :");
         if (reservation1.sejourPlusLongQue(reservation2)) {
             System.out.println("La première réservation est plus longue.");
         } else {
             System.out.println("La deuxième réservation est plus longue.");
         }
     }
     
}
