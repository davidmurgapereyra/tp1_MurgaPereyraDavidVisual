package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private Double salario;
	
	final Double SALARIO_MINIMO = 210000.00;
	final Double MERITOS = 20000.00;
	
	public Empleado() {}
	
	
	public Empleado(String nombre, Integer legajo, Double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario <= SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}

	public void mostrarDatos() {
		System.out.println("Nombre del empleado: " + this.nombre);
		System.out.println("Legajo: " + this.legajo);
		System.out.println("Salario: " + this.salario);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Double getSalario() {
		return salario;
	}

	public void aumentarSalario() {
		this.salario += MERITOS;
	}

	public void setSalario(Double salario) {
		if(salario < SALARIO_MINIMO) {
			this.salario = SALARIO_MINIMO;
		} else {
			this.salario = salario;
		}
	}

	
}
