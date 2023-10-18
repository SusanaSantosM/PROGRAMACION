public class Operaciones {
    public void verOperaciones(short num1,short num2){
        double resta = num1-num2;
        double suma = num1+num2;

        if(num1>=num2)
            System.out.println("Vemos la resta" +resta);
        System.out.println("Vemos la suma" +suma);
    }
}
