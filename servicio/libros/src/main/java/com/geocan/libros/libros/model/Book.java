package com.geocan.libros.libros.model;

public class Book {
	
	
	private String autor;
	private String editorial;
	private String imagen;
	private String idioma;
	private String contenido;
	private String titulo;
	
	
	public Book(String autor, String editorial, String imagen, String idioma, String contenido, String titulo) {
		super();
		this.autor = autor;
		this.editorial = editorial;
		this.imagen = imagen;
		this.idioma = idioma;
		this.contenido = contenido;
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
}
