package net.miguel.poo.pojos;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getEjemplares() {
		return ejemplares;
	}


	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}


	public int getPrestados() {
		return prestados;
	}


	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, ejemplares, prestados, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && ejemplares == other.ejemplares && prestados == other.prestados
				&& Objects.equals(titulo, other.titulo);
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getEjemplares()="
				+ getEjemplares() + ", getPrestados()=" + getPrestados() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	 //método para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //método para realizar la devolución de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }
}
