
package boletin17;

public class CuentaCorriente extends Conta {
    private final double INTERES = 0.015;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
    }
    
    
    @Override
    public String toString() {
        return "CuentaCorriente{" + "intereseFixo=" + INTERES + '}';
    }
    
    @Override
    public void actualizarSaldo(){
        setSaldo(INTERES*getSaldo());
    }
    
    
}
