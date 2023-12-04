public class Conta {
    private double numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta() {
    }

    public Conta(double numeroConta, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        if(saldo>0){
            this.saldo=0;
        }else {
            this.saldo = saldo;
        }
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta1{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

    public void ingresar(double cantidad) {
        if(cantidad>0){
            saldo = saldo + cantidad;
            System.out.println("El monto ingresado es: "+cantidad);
        }else {
            System.out.println("Monto ingresado no es correcto");
        }
    }

    public void retirar(double cantidad){
        if(saldo-cantidad<0){
            System.out.println("No hay saldo suficiente");

        }else{
            saldo-=cantidad;
            System.out.println("La cantidad retira es:"+cantidad);
        }
    }

    public void actualizarSaldo(){
        //
    }
}
