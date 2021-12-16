/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  /**
   * Constructor sin parámetros
   */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Numero de cuenta del titular
    * @param sal Cantidad de dinero en la cuenta
    * @param tipo Acuerdo de intereses firmados en el contrato
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Asigna nombre del titular
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * 
    * @return Nombre
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * 
     * @return Saldo: Cantidad de dinero disponible en la cuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * 
    * @param cantidad
    * @throws Exception 
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return Devuelve el número de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta 
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * 
   * @param saldo 
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @return Devuelve el tipo de interés
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * 
   * @param tipoInterés 
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
