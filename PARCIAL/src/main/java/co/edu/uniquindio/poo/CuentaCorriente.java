package co.edu.uniquindio.poo;

public class CuentaCorriente extends CuentaBancaria{
    private  double limiteSobregiro;

    /*
     * Método Constructor de la clase Cuenta Corriente
     */
    public CuentaCorriente (Titular titular, int numeroCuenta, double saldo,boolean estadoCuenta, double limiteSobregiro){
        super(titular, numeroCuenta, saldo, estadoCuenta);
        this.limiteSobregiro = limiteSobregiro;
        assert limiteSobregiro > 0;

    }

    /*
     * Método para obtener el valor limite de un sobregiro
     */
    public double getLimiteSobregiro(){
        return limiteSobregiro;
    }

    /*
     * Método para retirar dinero de una cuenta corriente
     */
    @Override
    public void retirarDinero (double dinero){
        assert dinero > 0;
        assert dinero <= saldo + limiteSobregiro;
        saldo-= dinero;
        if (saldo < dinero){
            limiteSobregiro += saldo;
        }
    }

}
 