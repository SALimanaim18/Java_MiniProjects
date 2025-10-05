package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter un nombre:");
	  
	  try {
	     int nbr=sc.nextInt();
	     if(nbr<0) {
	    	 throw new NegativeNumberException("le nombre est negatif");
	     }
	  }catch(InputMismatchException e){
		  System.err.println("le nombre n'est pas entier");
	  }catch(NegativeNumberException ex) {
		  System.err.println("l'erreur est : "+ ex.getMessage());
	  }finally {
		  System.out.println("fin d'operation");
	
	  }
	  int[] tab= {1,2,3,4,5};
	     System.out.print("Enter un index:");
		
	    try {
	     int nbr=sc.nextInt();	
	     System.out.print(tab[nbr]);
	     }catch(ArrayIndexOutOfBoundsException e) {
	    	 System.err.println("l'index est en dehors des limites de tableau");
	     }
	    System.out.print("Enter age: ");
	    try {
	     int age=sc.nextInt();
	     validateAge(age);
	    }catch( AgeNotValidException e) {
	    	System.err.println(e.getMessage());
	    }
	    
	    System.out.print("Enter deux nombres: ");
	    try {
		     int nbr1=sc.nextInt();
		     int nbr2=sc.nextInt();
		     float nb=nbr1/nbr2;
		     
		 
		     }catch(ArithmeticException e) {
		    	 System.err.println("le nombre ne peux pas etre divisé par 0");
		     }catch(InputMismatchException e2) {
		    	 System.err.println("vous n'avez pas entrer un nombre");
		     }
	    
	    try {
		    divide(1,0);
		     }catch(ArithmeticException e) {
		    	 System.err.println("le nombre ne peux pas etre divisé par 0");
		     }
	 
	   
	    try(Scanner scanner = new Scanner(System.in)) {
	    	 System.out.print("Enter un nombre: ");
	    	 int nombre=scanner.nextInt();
	    }catch(InputMismatchException e2) {
	    	 System.err.println("vous n'avez pas entrer un nombre entier");
	     }
	    
	    double number = -1;  // Variable pour stocker le nombre

        while (true) {
            // Affichage du menu
            System.out.println("\nMenu:");
            System.out.println("1. Entrer un nombre");
            System.out.println("2. Afficher la racine carrée du nombre");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            
            // Lecture de l'option choisie
            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());  // Lire l'option comme un entier
            } catch (NumberFormatException e) {
                System.err.println("Erreur : Veuillez entrer un numéro valide.");
                continue;  // Recommencer la boucle si l'entrée n'est pas un nombre
            }

            switch (choice) {
                case 1:  // Entrer un nombre
                    System.out.print("Veuillez entrer un nombre : ");
                    try {
                        number = Double.parseDouble(sc.nextLine());  // Lire un nombre réel
                    } catch (NumberFormatException e) {
                        System.err.println("Erreur : Ce n'est pas un nombre valide.");
                    }
                    break;

                case 2:  // Afficher la racine carrée du nombre
                    try {
                        if (number < 0) {
                            throw new NegativeNumberException("Erreur : Le nombre ne peut pas être négatif pour la racine carrée.");
                        }
                        double squareRoot = Math.sqrt(number);  // Calculer la racine carrée
                        System.out.println("La racine carrée de " + number + " est : " + squareRoot);
                    } catch (NegativeNumberException e) {
                        System.err.println(e.getMessage());  // Afficher le message d'erreur personnalisé
                    }
                    break;

                case 3:  // Quitter
                    System.out.println("Au revoir !");
                  
                    return;  // Quitter le programme

                default:
                    System.err.println("Erreur : Option invalide.");
                    break;
            }
            sc.close(); 
            }
	     
	   
	}
			  
		
	public void convertToInt(String s) {
		try {
		Integer entier=Integer.parseInt(s);
	}catch(NumberFormatException e) {
		System.err.println("le nombre ne peut pas etre convertit");
		}
	}
	public void calculAverage(int[] tab) {
	  try {
		if (tab.length == 0) {
            throw new ArithmeticException("Le tableau est vide");
        }
		int somme=0;
		for (int i=0;i<tab.length;i++) {
		
			 somme+=tab[i];
		}
		float avg=somme/(tab.length);}
		catch(ArithmeticException e) {
			System.err.println("l'erreur est : "+ e.getMessage());
		}
	}
		
	public static void validateAge(int age) throws AgeNotValidException {
		if (age<18 || age>120) {
			throw new  AgeNotValidException("l'age doit etre valide");
		}
		
	}
	public static void divide(int a, int b) throws ArithmeticException{
		float c=a/b;
	}
		
		
		
		
		
		
		
		
/*		
		 // 1-Gestion de base des Exceptions---------------------------
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter un nombre:");
			int nombre=sc.nextInt();
			if(nombre<0) {
				throw new NegativeNumberException("Negative number");
			}
		}catch(InputMismatchException e){
			System.err.print(e.getMessage());
		}catch(NegativeNumberException e) {
			System.err.print(e.getMessage());
		}
		finally{
			System.out.print("La fin de l'opération");
			
		}
		
		// 2-Gestion d'un tableau et ArrayIndexOutOfBoundsException------------------------------
		try {
			int [] tab= {1,6,8,0,2};
			Scanner sc=new Scanner(System.in);
			System.out.print("Entrer index:");
			int index=sc.nextInt();
			System.out.print(tab[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.print(e.getMessage());
		}
		
		// 3-Conversion de chaine en Nombre----------------------------------
		try {
			String s="3A3";
			System.out.print(convertToInt(s));
		}catch(NumberFormatException e) {
			System.err.print(e.getMessage());
		}
		// 4-Calcul de Moyenne et ArithmeticException ------------------------
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Entrer votre age");
			int age=sc.nextInt();
			validateAge(age);
		}catch(AgeNotValidException e) {
			System.err.print(e.getMessage());
		}
		
		
		 // 6----------------------------------------
		try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Entrer nb1:");
		int nb1=sc.nextInt();
		System.out.print("Entrer nb2:");
		int nb2=sc.nextInt();
		System.out.print(nb1/nb2);
		}
		catch(InputMismatchException e) {
			System.err.print(e.getMessage());
		}catch(ArithmeticException e) {
			System.err.print(e.getMessage());
		}
		//7---------------------------------------
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Entrer nb1:");
			int nb1=sc.nextInt();
			System.out.print("Entrer nb2:");
			int nb2=sc.nextInt();
			System.out.print(divide(nb1,nb2));
		}catch(ArithmeticException e) {
			System.err.print(e.getMessage());
		}
		
		//variable globale
		
		 // -------------8
		Scanner sc=new Scanner(System.in);
		try {
			
			int nb1=sc.nextInt();
		}catch(InputMismatchException e) {
			System.err.print(e.getMessage());
		}finally {
			sc.close();
		}
		
		Scanner sc1=new Scanner(System.in);
		int choix;
		try {
			do {
				System.out.println("----------------------------------");
				menu();
				System.out.print("Entrer votre choix:");
				choix=sc1.nextInt();
				int Nombre=0;
				switch(choix) {
					case 1:
						System.out.print("Entrer un nombre:");
						Nombre=sc1.nextInt();
						if(Nombre<0) {
							throw new NegativeNumberException("Invalid number");
						}
					case 2:
						if(Nombre!=0) {
							System.out.println("La racine carree du"+Nombre+"est :"+Math.sqrt(Nombre));
						}else {
							System.out.println("Tu dois entrer un nombre");
						}
					case 3:
						break;
				}
			}while(choix!=3);
		}catch(NegativeNumberException e) {
			System.err.print(e.getMessage());
		}catch(InputMismatchException e) {
			System.err.print(e.getMessage());
		}
		
	}
	public static int divide(int a,int b) throws  ArithmeticException{
		return a/b;
	}
	
	public static int convertToInt(String s){
		return Integer.valueOf(s);
	}
	public static void validateAge(int age) throws AgeNotValidException{
		if(age<18 || age>120) {
			throw new AgeNotValidException("age invalide");
		}
	}
	
	public static void menu() {
		System.out.println("1.Entrer un nombre");
		System.out.println("2.Afficher la racine carree du nombre");
		System.out.println("3.Quitter");
	}
	
	public static void calculateAverage (int[] tab) {
		if(tab.length==0) {
			throw new ArithmeticException();
		}
		*/
	
	
	 
}