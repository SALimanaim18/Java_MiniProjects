package TP8;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
      
        if(a1.getNom().equals(a2.getNom()) && a1.getAge()==(a2.getAge()))   return 1;
        else return -1;
    }
}