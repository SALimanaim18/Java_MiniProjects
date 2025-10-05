package TP9;

import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;

public class CreateFile implements Consumer<String> {

	@Override
	public void accept(String t) {
		File f=new File(t);
		try {
			if(f.createNewFile())
			  System.out.println("fichier créer"+ f.getName());
			else {
	            System.out.println("Le fichier existe déjà.");
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       
}
