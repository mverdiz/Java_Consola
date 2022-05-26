package net.miguel.uf1844.coche.pojos;

import java.math.BigDecimal;
import java.util.Objects;

public class Coche {
	private Long id;
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private BigDecimal potencia;
	private BigDecimal cilindrada;
	
	
	public Coche(Long id, String matricula, String marca, String modelo, String color, BigDecimal potencia,
			BigDecimal cilindrada) {
		setId(id);
		setMatricula(matricula);
		setMarca(marca);
		setModelo(modelo);
		setColor(color);
		setPotencia(potencia);
		setCilindrada(cilindrada);
	}
	
	public Coche () {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public BigDecimal getPotencia() {
		return potencia;
	}

	public void setPotencia(BigDecimal potencia) {
		this.potencia = potencia;
	}

	public BigDecimal getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(BigDecimal cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cilindrada, color, id, marca, matricula, modelo, potencia);
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
				&& Objects.equals(id, other.id) && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(potencia, other.potencia);
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}

}
