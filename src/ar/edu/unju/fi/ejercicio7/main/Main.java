package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Empleado empleado = new Empleado();
		
		System.out.print("Ingrese el nombre del empleado: ");
		empleado.setNombre(scanner.nextLine());
		System.out.print("Ingrese el legajo del empleado: ");
		empleado.setLegajo(scanner.nextInt());
		System.out.print("Ingrese salario del empleado: ");
		empleado.setSalario(scanner.nextDouble());
		
		empleado.mostrarDatos();
		
		System.out.print("¿Aumentar el salario del empleado por merito? \n1=yes/else=no: ");
		int res = scanner.nextInt(); 
		if(res == 1) { 
		    empleado.aumentarSalario();
		    empleado.mostrarDatos();
		} else {
		    System.out.println("No se ha realizado ningún aumento de salario.");
		}
	
		scanner.close();
	}

}
