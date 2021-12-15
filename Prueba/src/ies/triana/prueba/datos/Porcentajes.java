package ies.triana.prueba.datos;

import java.util.Scanner;

public class Porcentajes {

	public static void main(String[] args) {
		
		double precio;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Precio: ");
		precio = scan.nextDouble();

		
		double iva1 = 21.0;
		double iva2 = 18.0;
		double iva3 = 9.0;
		
		double precioIva1 = (precio*iva1)/100 + precio;
		double precioIva2 = (precio*iva2)/100 + precio;
		double precioIva3 = (precio*iva3)/100 + precio;
		
		System.out.println("El producto de valor "+precio+"€ tiene un precio con IVA de:");
		System.out.println("21% de IVA = "+precioIva1+"€\n18% de IVA = "+precioIva2+"€\n9% de IVA = "+precioIva3+"€");
		

	}

}
