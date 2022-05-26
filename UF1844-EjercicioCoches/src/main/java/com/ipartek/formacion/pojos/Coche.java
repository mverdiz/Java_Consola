package com.ipartek.formacion.pojos;

import java.util.Objects;



public class Coche {
	
	
	private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int potencia;
    private int cilindrada;
    
     
    
		
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cilindrada, color, marca, matricula, modelo, potencia);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(cilindrada, other.cilindrada) && Objects.equals(color, other.color)
				&& Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(potencia, other.potencia);
	}
	
	
    
	
    

}
