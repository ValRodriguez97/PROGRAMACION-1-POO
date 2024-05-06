package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class Transaccion {
    private String codigo;
    private int valor;
    private LocalDate fecha;
    private String descripcion;
    private boolean estadoTransaccion;
    private TipoTransaccion tipoTransaccion;

    /*
     * Método constructor de la clase Transacción
     */
    public Transaccion (String codigo, int valor, LocalDate fecha, String descripcion, boolean estadoTransaccion, TipoTransaccion tipoTransaccion){
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estadoTransaccion = estadoTransaccion;
        this.tipoTransaccion = tipoTransaccion;
        assert codigo != null && !codigo.isBlank();
        assert valor > 0;
        assert descripcion != null && !descripcion.isBlank();
        assert estadoTransaccion == true;
        
    }

    /*
     * Método para obtener el codigo de una transacción
     * @return codigo de una transacción bancaria
     */
    public String getCodigo (){
        return codigo;
    }

    /*
     * Método para obtener el valor de una transacción
     * @return valor de una transacción
     */
    public int getValor (){
        return valor;
    }

    /*
     * Método para obtener la fecha de una transacción
     * @return fecha de una transacción
     */
    public LocalDate getFecha (){
        return fecha;
    }

    /*
     * Método para obtener la descripcion de una transacción
     * @return descripcion de una transacción
     */
    public String getDescripcion (){
        return descripcion;
    }

    /*
     * Método para obtener el estado de una transacción
     * @return estado transaccion
     */
    public boolean getEstadoTransaccion (){
        return estadoTransaccion;
    }

    /*
     * Método para obtener el tipo de transacción
     * @return tipo de transacción
     */
    public TipoTransaccion getTipoTransaccion (){
        return tipoTransaccion;
    }

    /*
     * Método para transferir dinero
     */
    public void transferirDinero(CuentaBancaria cuentaBancaria, CuentaBancaria cuentaDestino){
        if (cuentaBancaria != null && cuentaDestino != null){
            if (cuentaBancaria.estadoCuenta() == true && cuentaDestino.estadoCuenta() == true){
                if (cuentaBancaria.getSaldo() >= valor && valor > 0){
                    cuentaBancaria.retirarDinero(valor);
                    cuentaDestino.depositarDinero(valor);
                    System.out.println("Transferencia exitosa");
                }
                else {
                    System.out.println("Error, no se pudo efectuar la transaccion, no hay saldo disponible en la cuenta");
                    estadoTransaccion = false;
                }
            }
            else {
                System.out.println("Error, una de las cuentas esta inactiva");
                estadoTransaccion = false;
            } 
        }
        else{
            System.out.println("Error, no se pudo efectuar la transacción, una de las cuentas es inexistente");
            estadoTransaccion = false;
        }
    }

}
/*
 * Método opcional para no transferir dinero a una cuenta inexistente, es decir que no esta registrada en un banco
 */
/*public void transferirDinero (CuentaBancaria cuentaBancaria, CuentaBancaria cuentaDestino){
        //assert cuentasExistentes (cuentaBancaria, cuentaDestino) : "la cuenta no existe";
        //if (cuentasExistentes (cuentaBancaria, cuentaDestino)){
            if (cuentaBancaria.estadoTransaccion == true && cuentaDestino.estadoTransaccion){
                if (cuentaBancaria.getSaldo() >= valor && valor > 0){
                        cuentaBancaria.retirarDinero(valor);
                        cuentaDestino.depositarDinero(valor);
                        System.out.println("Transferencia exitosa");
                    }
                else {
                    System.out.println("Error, El saldo de la cuenta es insuficiente y la cuenta esta inactiva");
                }
            }
            else {
                System.out.println("Error, no se puede transferir dinero a una cuenta inactiva");
            }
        //}
        //else{
            //System.out.println("La cuenta no existe");
        //}
        
    }        

    //public boolean cuentasExistentes (CuentaBancaria cuentaBancaria, CuentaBancaria cuentaDestino){
      //  return Banco.cuentasExistentes(Banco.cuentas,cuentaBancaria.getNumeroCuenta()) && Banco.cuentasExistentes(Banco.cuentas, cuentaDestino.getNumeroCuenta());
    //}*/
