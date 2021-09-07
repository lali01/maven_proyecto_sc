package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. contains

		String frase = "Programacion de algoritmos modulo 2 ";

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el nombre del libro");
		String palabra = in.nextLine();

		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra: " + resultado);

	
		//2 equals
		
		System.out.println("**************************");
		String cadena1 = "stefany";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = in.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("las cadenas son iguales:" +resultado2);
		
		//3. y 4. upper y lower
		
		System.out.println("**************************");
		String nombre = "juanito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en Mayusucula: " + nombreEnMayuscula);
	
		String nombre2 = "JOSE";
		String nombreEnMinuscula = nombre.toLowerCase();
		System.out.println("Nombre en Minuscula: " + nombreEnMinuscula);
		
	
	
	}

}
