package TP8;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//ex1
		List fruits=new ArrayList();
		fruits.add("orange");
		fruits.add("banane");
		fruits.add("pomme");
		fruits.add("fraise");
		fruits.add("kiwi");
		for (int i=0; i < fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("------------------");
		for(Object fruit:fruits){
			System.out.println( fruit);
		}
		System.out.println("------------------");
		Iterator it=fruits.iterator();
		while(it.hasNext()) {
			System.out.println( it.next());
		}
		System.out.println("------------------");
		System.out.println(fruits.toString());
		
		fruits.add(2,"mongue");
		System.out.println(fruits);
		fruits.remove(3);
		System.out.println(fruits);
		fruits.set(1,"pomme");
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.contains("banane"));
		System.out.println(fruits.get(2));
		String result = "";
		for (Object fruit : fruits) {
		    result += fruit + " "; 
		}
		System.out.println(result);
		//ex2
		List liste1=new ArrayList();
		List liste2=new LinkedList();
		liste1.add("salima");
		liste1.add("wahiba");
		liste1.add("yasmine");
		liste1.add("oumaima");
		liste1.add("amal");
		liste1.add("sara");
		liste1.add("hiba");
		liste1.add("aya");
		liste1.add("siham");
		liste1.add("ikram");
		
		liste2.add("salima");
		liste2.add("wahiba");
		liste2.add("yasmine");
		liste2.add("oumaima");
		liste2.add("amal");
		liste2.add("sara");
		liste2.add("hiba");
		liste2.add("aya");
		liste2.add("siham");
		liste2.add("ikram");
		
		liste1.addFirst("hajar");
		liste2.addFirst("hajar");
		System.out.println(liste1);
		System.out.println(liste2);
		
		liste1.remove(5);
		liste2.remove(5);
		System.out.println(liste1);
		System.out.println(liste2);
		
		liste1.add("zineb");
		liste2.add("zineb");
		System.out.println(liste1);
		System.out.println(liste2);
		
		LocalTime time1=LocalTime.now();
		for(int i=0; i<10000; i++) {
			liste1.add("hi");
		}
		LocalTime time2=LocalTime.now();
		Duration duree1=Duration.between(time1, time2);
		System.out.println("pour Arraylist : " + duree1.toMillis() + " ms");
		LocalTime time3=LocalTime.now();
		for(int i=0; i<10000; i++) {
			liste2.add("hi");
		}
		LocalTime time4=LocalTime.now();
		Duration duree2=Duration.between(time3, time4);
		
		System.out.println("pour LinkedList : " + duree2.toMillis() + " ms");
		
		LocalTime time5=LocalTime.now();
		for(int i=0; i<10000; i++) {
			liste1.get(9000);
		}
		LocalTime time6=LocalTime.now();
		Duration duree3=Duration.between(time5, time6);
		
		System.out.println("pour ArrayList : " + duree3.toMillis() + " ms");
		
		LocalTime time7=LocalTime.now();
		for(int i=0; i<10000; i++) {
			liste2.get(9000);
		}
		LocalTime time8=LocalTime.now();
		Duration duree4=Duration.between(time7, time8);
		
		System.out.println("pour LinkedList : " + duree4.toMillis() + " ms");
		
		//ex3
		List taches=new LinkedList();
		taches.add("conception");
		taches.add("modelisation");
		taches.add("plannification");
		taches.add("realisation");
		taches.add("test");
		System.out.println(taches);
		taches.add(2,"deploiement");
		System.out.println(taches);
        String tacheTerminee = "realisation";
        if (taches.remove(tacheTerminee)) {
            System.out.println("Tache terminée et supprimée : " + tacheTerminee);}
		System.out.println(taches);
		taches.set(2, "realisation");
		System.out.println(taches);
		
		//ex4
		List products=new ArrayList();
		products.add("P1");
		products.add("P2");
		products.add("P3");
		products.add("P4");
		products.add("P5");
		products.add("P6");
		products.add("P7");
		System.out.println(products);
		System.out.println(products.contains("P2"));
		products.remove("P2");
		products.add("P2");
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("rechercher un produit: ");
		String s=sc.nextLine();
		if(products.contains(s)) {
			System.out.println("produit existant");
		}else{
			System.out.println("produit inexistant ");
		};
		System.out.println("supprimer un produit: ");
		String ss=sc.nextLine();
		if(products.contains(ss)) {
		 products.remove(ss);
		System.out.println("produit supprimer ");
		 }
		else {
			System.out.println("produit introuvable ");
	
		}
		System.out.println("ajouter un produit: ");
		String sss=sc.nextLine();
		products.add(sss);
		*/
		for(Object product:products) {
			System.out.println(product);
		}
		
		//ex5
		List<String> villes1 = new ArrayList<>();
        villes1.add("Casablanca");
        villes1.add("Rabat");
        villes1.add("Fes");
        villes1.add("Marrakech");
        villes1.add("Tanger");

        List<String> villes2 = new ArrayList<>();
        villes2.add("Agadir");
        villes2.add("Oujda");
        villes2.add("Meknès");
        villes2.add("Tétouan");
        villes2.add("Laâyoune");
        
        villes1.addAll(villes2);
		System.out.println(villes1);
		System.out.println(villes2);
		
		//ex6
		List<String> jours = new LinkedList<>();
	    jours.add("Lundi");
	    jours.add("Mardi");
	    jours.add("Mercredi");
	    jours.add("Jeudi");
	    jours.add("Vendredi");
	    jours.add("Samedi");
	    jours.add("Dimanche");
	    System.out.println(jours.subList(0, 3));
	    System.out.println(jours.subList(5, 7));
    }
	
}
