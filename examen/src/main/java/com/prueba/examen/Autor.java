package com.prueba.examen;

public class Autor {
	private String nombre;
	private String genero;
	private String nacionalidad;
	public Autor(String nombre, String genero, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getGenero() {
		return genero;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	@Override
	public String toString() {
		return "Autor: " + nombre + ", Género: " + genero + ", Nacionalidad: " + nacionalidad + "\n";
	}
}
