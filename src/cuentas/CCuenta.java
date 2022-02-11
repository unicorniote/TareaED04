package cuentas;

/**
 * Clase CCuenta. Crea objetos de tipo CCuenta.
 * @author Tamara
 *
 */
public class CCuenta {
	/**
	 * Nombre del cliente
	 */
    private String nombre;
    
    /**
     * Número de cuenta
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interes
     */
    private double tipoInteres;
    
    /**
     * Constructor de objetos de tipo CCuenta   
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor de objetos tipo CCuenta con parametros
     * @param nom nombre del cliente
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Método que devuelve el saldo de la cuenta
     * @return saldo disponible en la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método que inserta dinero en la cuenta
     * @param cantidad cantidad a ingresar
     * @throws Exception Captura la excepcion si la cantidad es negativa o 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception Captura la excepcion en caso de cantidad negativa o superior al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Método que devuelve el nombre del cliente 
     * @return nombre del cliente
     */
	private String getNombre() {
		return nombre;
	}
	 
	/**
	 * Método para asignar el nombre del cliente
	 * @param nombre nombre del cliente
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método que devuelve el número de cuenta
	 * @return numero de cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Método para asignar el número de cuenta
	 * @param cuenta numero de cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Método que devuelve el saldo de la cuenta
	 * @return saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * Método para asignar el saldo de la cuenta
	 * @param saldo saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Método que devuelve el tipo de interes de la cuenta
	 * @return tipo de interes de la cuenta
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método que asigna el tipo de interes de la cuenta
	 * @param tipoInteres tipo de interes de la cuenta
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
