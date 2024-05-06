package co.edu.uniquindio.poo;

public class CuentaAhorros extends CuentaBancaria{
    private  double tasaInteres;;

    /*
     * Método Constructor de la clase Cuenta Ahorros
     */
    public CuentaAhorros (Titular titular, int numeroCuenta, double saldo,boolean estadoCuenta, double tasaInteres){
        super(titular, numeroCuenta, saldo, estadoCuenta);
        this.tasaInteres = tasaInteres;
    }

    /*
     * Método para obtener la tasa de interes de una cuenta de ahorros
     * @return tasa interes
     */
    public double getTasaInteres (){
        return tasaInteres;
    }

    /*
     * Método para retirar dinero de una cuenta de ahorros
     */
    public void retirarDinero(double dinero){
        assert dinero > 0;
        assert dinero <= saldo;
        saldo -= dinero * tasaInteres;
        if (saldo == 0) {
            estadoCuenta = false;
        }
    }
}

// arquitectura - como se distribuyen su ubicacion y como se conectan componentes 

