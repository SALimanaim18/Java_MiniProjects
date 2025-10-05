package TP10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Application {
   public static void main(String[] args) throws IOException, ClassNotFoundException {
//	  File f= new File("C:\\Users\\naim SALIMA\\Pictures\\Screenshots\\imgg.png");
//	  FileInputStream is=new FileInputStream(f);
//	 System.out.print(is.read()); 
//	 System.out.printf("%02X ",is.read());
//	 System.out.print((char)is.read());
//	  is.close();
	   
   File ff= new File("C:\\Users\\naim SALIMA\\Downloads\\Cahier_Des_Charges.docx");
//     FileReader fr=new FileReader(ff);
//     while((fr.read())!=-1)
//	   System.out.print((char)fr.read());
//	  
//     

//     FileWriter fw=new FileWriter(ff);
//     BufferedWriter bw=new BufferedWriter(fw);
//     BufferedReader br=new BufferedReader(fr);
//     while((c=br.readLine())!=null)
//    	 System.out.print((char)br.read());
//
//     bw.write("bonjour");
//     br.close();
//     fr.close();
//     
//     bw.close();
//     fw.close();
//     
//     
//     Scanner scanner = new Scanner(ff);
//         int wordCount = 0;
//         while (scanner.hasNextLine()) {
//             String line = scanner.nextLine();
//             System.out.println(line);
//             wordCount += line.split("\\s+").length;
//         }
//         System.out.println("Nombre de mots : " + wordCount);
//     scanner.close();
//     
//
//   PrintWriter writer = new PrintWriter(ff);
//       int[] numbers = {10, 20, 30, 40, 50};
//
//       writer.println("Tableau des nombres :");
//       for (int number : numbers) {
//           writer.printf("Nombre : %d%n", number);
//       
//        }
//       System.out.println("Données formatées écrites dans le fichier : " + ff.getPath());
//       
//    try (
//	   FileWriter fw2=new FileWriter(new File("C:\\Users\\naim SALIMA\\Downloads\\K-Means.txt"));
//	   FileReader fr2=new FileReader(new File("C:\\Users\\naim SALIMA\\Downloads\\K-Means.txt"))
//		   )
//	   
//   {
//	fw2.write("hello");
//	fw2.flush();
//	
//	System.out.print((char)fr2.read());
//	System.out.print((char)fr2.read());
//	System.out.print((char)fr2.read());
//	System.out.print((char)fr2.read());
//	System.out.print((char)fr2.read());
//  }catch(IOException io) {
//	io.printStackTrace();
//  }
//   FileOutputStream fos=new FileOutputStream(ff);
//   ObjectOutputStream oos=new ObjectOutputStream(fos);
//   Personne p=new Personne("salima",21);
//   oos.writeObject(p);
//   fos.close();
//   oos.close();
//   FileInputStream fis=new FileInputStream(ff);
//   ObjectInputStream ois=new ObjectInputStream(fis);
//   Personne p2=(Personne)ois.readObject();
//   System.out.println(p2.nom+p.age);
//   fis.close();
//   ois.close();
   
//   Scanner sc=new Scanner(System.in); 
//   System.out.println("entrer chemin: ");
//   String s=sc.nextLine();
//   Path path=Paths.get(s);
//
//   if(Files.exists(path)) {
//     Stream ss=Files.lines(path);
//     ss.forEach(System.out::println);
//     
//     List<String> l=Files.readAllLines(path);
//     for (String line : l) {
//		System.out.println(line);
//	}
//   }else {System.out.println("chemin introuvable");}
//   sc.close();
   
//   Scanner sc2 = new Scanner(System.in);
//
//   // Demander le chemin et vérifier l'existence
//   System.out.println("Entrez le chemin du fichier : ");
//   Path path2 = Paths.get(sc2.nextLine());
//
//   if (Files.exists(path2)) {
//     
//           System.out.println("Entrez le texte à écrire dans le fichier : ");
//          // Files.writeString(path2, sc2.nextLine()); //si on veut ecraser le contenu
//          //Files.writeString(path2, sc2.nextLine() + System.lineSeparator(), StandardOpenOption.APPEND);
//           FileWriter fileWriter = new FileWriter(path2.toString(), true); // true pour append et non pas ecraser
//           fileWriter.write(sc2.nextLine()  + System.lineSeparator());fileWriter.close();
//           System.out.println("Texte écrit avec succès !");
//           Stream ss=Files.lines(path2);
//           ss.forEach(System.out::println); 
//     
//   } else {
//       System.out.println("Chemin introuvable.");
//   }
//  
//   sc2.close();
   
   Scanner sc3 = new Scanner(System.in);

   // Demander le chemin de l'image
   System.out.println("Entrez le chemin de l'image : ");
   Path path3 = Paths.get(sc3.nextLine());

   // Vérifier si le fichier existe
   if (Files.exists(path3)) {
       
           // Lire et modifier les données
           byte[] data = Files.readAllBytes(path3);
           for (int i = 0; i < data.length; i++) {
               data[i] += 10; // Ajouter 10 à chaque byte
           }

           // Sauvegarder les données modifiées
           Files.write(path3, data);
//           for(byte b:data) {
//        	   System.out.println(b);
//           }
    
   } else {
       System.out.println("Fichier introuvable.");
   }

   sc3.close();
   
}
}
