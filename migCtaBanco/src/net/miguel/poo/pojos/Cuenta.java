package net.miguel.poo.pojos;

public class Cuenta {
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	// Constructor por defecto
	public Cuenta() {
	}

	// Constructor con parámetros
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	// Constructor copia
	public Cuenta(final Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// método ingreso
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;
		if (n <= 0) {
			throw new RuntimeException("Ingresos a partir de 1 euro..!!Gracias");
			//ingresoCorrecto = false;
		} else {
			saldo = saldo + n;
		}
		return ingresoCorrecto;
	}

	// método reintegro
	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;
		if (n < 0) {
			reintegroCorrecto = false;
		} else if (saldo >= n) {
			saldo -= n;
		} else if (saldo < n) {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}
	
	// método transferencia
	public double transferencia(Cuenta c, double n) {
		double correcto = saldo;
		if (n <= 0) {
			throw new RuntimeException("Tranferencias a partir de 1 euro..!!Gracias");
		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		} else if (saldo < n) {
			throw new RuntimeException("No hay saldo suficiente");
		} 
		return correcto;
	}
	
	
	// método transferencia
	/*public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		if (n < 0) {
			correcto = false;
		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		} else {
			correcto = false;
		}
		return correcto;
	}*/
}
