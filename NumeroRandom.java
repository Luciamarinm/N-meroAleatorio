package es.fempa.dam.programacionjava;

import java.util.Scanner;

public class NumeroRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int aleatorio = (int) ((Math.random() * 100)+1);
		int numero;
		int intentos = 10;

		System.out.println("Acierta el número del 1 al 100, tienes 10 intentos  ");
		numero = sc.nextInt();
		while (numero != aleatorio && intentos >= 1) {
			intentos = intentos -1;
			if (numero > 100 || numero < 1) {
				System.out.println("Número fuera de rango, elige entre 1 y 100"); }
			if (numero == aleatorio) {
				System.out.println("Has acertado"); }
			else if (numero < aleatorio) {
				System.out.println("El número es más alto, quedan " + intentos + " intentos, sigue probando"); }
			else {
				System.out.println("El número es más bajo, quedan " + intentos + " intentos, sigue probando"); }
			if (intentos == 0) {
				System.out.println("No has acertado, el número es "+ aleatorio);
				break; }
			numero = sc.nextInt();
		}
	}
}		
