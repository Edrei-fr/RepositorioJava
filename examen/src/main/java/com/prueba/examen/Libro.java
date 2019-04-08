package com.prueba.examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Libro {
	private Autor autor=null;
	private String titulo;
	private String isbn;
	public Libro() {
		this.titulo="¿Quién mató al Señor Burns?";
		this.isbn="4444-5555-9999";
	}
	public Autor getAutor() {
		return autor;
	}
	@Autowired
	@Qualifier("autor1")
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void vender() {
		System.out.println("Aquí tienes tu libro con título " +
		titulo + " de " + autor.getNombre());
		}
	@Override
	public String toString() {
		return  autor + "Título: " + titulo + " - isbn: " + isbn;
	}
}
