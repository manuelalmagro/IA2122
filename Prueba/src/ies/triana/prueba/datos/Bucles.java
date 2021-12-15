package ies.triana.prueba.datos;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		int contador=0;
		int contadorPares=0;
		int sumaImpares=0;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Numero Menor: ");
		numero1 = scan.nextInt();
		
		System.out.println("Numero Mayor: ");
		numero2 = scan.nextInt();
		
		System.out.println("\nNúmero incrementado 7 unidades:");
		
		while(numero1<=numero2) {
			System.out.println(numero1);
			if(numero1%2==0) {
				contadorPares++;
			} else {
				sumaImpares=sumaImpares+numero1;
			}
			contador++;
			numero1 = numero1+7;

		}
		System.out.println("\nNúmeros que hay en esta secuencia: "+contador);
		System.out.println("Número pares que hay en esta secuencia: "+contadorPares);
		System.out.println("Suma de los números impares que hay en esta secuencia: "+sumaImpares);

	}

}
