package TP5;

import java.time.LocalDate;
import java.time.MonthDay;

public class SeasonUtil {
	public static String determinerSaison(LocalDate date) {
        MonthDay arrivee = MonthDay.from(date);
        MonthDay printempsDebut = MonthDay.of(3, 21);
        MonthDay eteDebut = MonthDay.of(6, 21);
        MonthDay automneDebut = MonthDay.of(9, 21);
        MonthDay hiverDebut = MonthDay.of(12, 21);

        if ((arrivee.isAfter(printempsDebut) || arrivee.equals(printempsDebut)) && arrivee.isBefore(eteDebut)) {
            return "Printemps";
        } else if ((arrivee.isAfter(eteDebut) || arrivee.equals(eteDebut)) && arrivee.isBefore(automneDebut)) {
            return "Été";
        } else if ((arrivee.isAfter(automneDebut) || arrivee.equals(automneDebut)) && arrivee.isBefore(hiverDebut)) {
            return "Automne";
        } else {
            return "Hiver";
        }
    }

}
