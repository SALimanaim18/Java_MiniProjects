package TP5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
     String nomClient;
     private LocalDate dateArrivee;
     private LocalDate dateDepart;
     private LocalTime heureArrivee;
     private LocalTime heureDepart;
     public Reservation() {}


     public Reservation(String nomClient, LocalDate dateArrivee, LocalDate dateDepart, LocalTime heureArrivee, LocalTime heureDepart) {
         this.nomClient = nomClient;
         this.dateArrivee = dateArrivee;
         this.dateDepart = dateDepart;
         this.heureArrivee = heureArrivee;
         this.heureDepart = heureDepart;
     }
     public Period calculerDureeSejour() {
    	 Period nbrj=Period.between(getDateDepart(), getDateArrivee());
    	 return nbrj; 
     }
     public Duration calculerDureeJournee() {
    	 Duration duree=Duration.between(getHeureArrivee(), getHeureDepart());
    	 return duree;
     }
     public boolean estValide() {
    	 return getDateDepart().isAfter(getDateArrivee())&& getHeureDepart().isAfter(getHeureArrivee());
     }
	public LocalDate getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}
	public LocalDate getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public LocalTime getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(LocalTime heureDepart) {
		this.heureDepart = heureDepart;
	}
	public LocalTime getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(LocalTime heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	public String afficherReservation() {
   	 DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 DateTimeFormatter formatter4=DateTimeFormatter.ofPattern("HH:mm");
     String formatterDateD=getDateDepart().format(formatter3);
     String formatterDateA=getDateArrivee().format(formatter3);
     String formatterHeureD=getHeureDepart().format(formatter4);
     String formatterHeureA=getHeureArrivee().format(formatter4);
     Period p=Period.between(getDateDepart(), getDateArrivee());
     String periodString = "";
     if (p.getYears() > 0) {
         periodString += p.getYears() + " an(s) ";
     }
     if (p.getMonths() > 0) {
         periodString += p.getMonths() + " mois ";
     }
     if (p.getDays() > 0) {
         periodString += p.getDays() + " jour(s)";
     }
     return formatterDateD + " " + formatterDateA + " " + formatterHeureD + " " + formatterHeureA + " " + periodString;

	}
	public Duration tempsAvantReservation() {
		
		LocalDateTime maintenant= LocalDateTime.now();
        LocalDateTime dateHeureArrivee = LocalDateTime.of(getDateArrivee(), getHeureArrivee());
        return Duration.between(maintenant, dateHeureArrivee);
    
	}
    public boolean sejourPlusLongQue(Reservation autreReservation) {
        return this.calculerDureeSejour().getDays() > autreReservation.calculerDureeSejour().getDays();
    }

    @Override
    public String toString() {
        return afficherReservation();
    }
     
}

