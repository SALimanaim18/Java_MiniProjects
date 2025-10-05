package TP9;

import java.util.Scanner;
import java.util.function.Supplier;

public class SaisieInteger implements Supplier<Integer>{

	@Override
	public Integer get() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Entrer entier: ");
			return sc.nextInt();
		}
	}
	
}