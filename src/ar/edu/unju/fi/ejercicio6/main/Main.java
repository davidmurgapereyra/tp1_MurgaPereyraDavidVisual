package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creación de Persona usando constructor por defecto:");
        Persona persona1 = new Persona();
        ingresarDatosPersona(persona1, scanner);
        persona1.mostrarDatos();
        System.out.println();

        System.out.println("Creación de Persona usando constructor parametrizado:");
        System.out.print("Ingrese DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Ingrese provincia: ");
        String provincia = scanner.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        persona2.mostrarDatos();
        System.out.println();

        System.out.println("Creación de Persona usando constructor con DNI, nombre y fecha de nacimiento:");
        System.out.print("Ingrese DNI: ");
        dni = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
        fechaNacimiento = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        persona3.mostrarDatos();

        scanner.close();
    }

    public static void ingresarDatosPersona(Persona persona, Scanner scanner) {
        System.out.print("Ingrese DNI: ");
        persona.setDni(scanner.nextLine());
        System.out.print("Ingrese nombre: ");
        persona.setNombre(scanner.nextLine());
        System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
        persona.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
        System.out.print("Ingrese provincia: ");
        persona.setProvincia(scanner.nextLine());
    }
}

