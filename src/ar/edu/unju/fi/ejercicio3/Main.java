package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Ingrese un número entero: ");
	  int numero = scanner.nextInt();
    
	  if (numero % 2 == 0) {  
          System.out.println("El número ingresado es par.");
          int triple = numero * 3;
          System.out.println("El triple del número es: " + triple);
	    } else {
          System.out.println("El número ingresado es impar.");
          int doble = numero * 2;
          System.out.println("El doble del número es: " + doble);
	    }
    
	    scanner.close();
	}
}
