package es.fempa.dam.programacionjava;

import java.util.Scanner;

public class NumeroRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int aleatorio = (int) ((Math.random() * 100)+1);
		int numero = 0;
		int intentos = 10;
		
		System.out.println("Acierta el n�mero del 1 al 100, tienes 10 intentos  ");
		
		while (numero != aleatorio) {
			intentos++;
			numero = sc.nextInt();
		
			if (numero < aleatorio) {
				System.out.println("El n�mero es m�s alto, sigue probando"); }
			else if (numero > aleatorio) {
				System.out.println("El n�mero es m�s bajo, sigue probando"); }
			else if (intentos == 10) {
				System.out.println("No has acertado, el n�mero es "+ aleatorio);
				break; }
		}
		if (numero == aleatorio) {
			System.out.println("Has acertado!");
		}
	}
}
		