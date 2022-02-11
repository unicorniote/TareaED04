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
     * N�mero de cuenta
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
     * M�todo que devuelve el saldo de la cuenta
     * @return saldo disponible en la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * M�todo que inserta dinero en la cuenta
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
     * M�todo para retirar dinero de la cuenta
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
     * M�todo que devuelve el nombre del cliente 
     * @return nombre del cliente
     */
	private String getNombre() {
		return nombre;
	}
	 
	/**
	 * M�todo para asignar el nombre del cliente
	 * @param nombre nombre del cliente
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * M�todo que devuelve el n�mero de cuenta
	 * @return numero de cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * M�todo para asignar el n�mero de cuenta
	 * @param cuenta numero de cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * M�todo que devuelve el saldo de la cuenta
	 * @return saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * M�todo para asignar el saldo de la cuenta
	 * @param saldo saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * M�todo que devuelve el tipo de interes de la cuenta
	 * @return tipo de interes de la cuenta
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * M�todo que asigna el tipo de interes de la cuenta
	 * @param tipoInteres tipo de interes de la cuenta
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
