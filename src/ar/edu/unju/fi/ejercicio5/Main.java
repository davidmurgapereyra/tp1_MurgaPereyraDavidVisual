package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 9 para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        if (numero < 1 || numero > 9) {
            System.out.println("El número debe ser entre 1 y 9.");
        } else {
            System.out.println("Tabla de multiplicar del " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
        scanner.close();
    }

}
