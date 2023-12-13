
package boletin17;

public class CuentaAhorro extends Conta {
    private double intereseVariable;
    private int ano;
    private double saldoMinimo;

    public CuentaAhorro(double numeroConta, Persoa cliente) {
        super(numeroConta,cliente);
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "intereseVariable=" + intereseVariable + ", ano=" + ano + ", saldoMinimo=" + saldoMinimo + '}';
    }
    
    @Override
    public void actualizarSaldo(){
        setSaldo(intereseVariable*getSaldo());
    }
    
    public void cambiarInterese(double interesNovo){
        intereseVariable = interesNovo;
    }
    
}

