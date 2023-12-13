public class Numero {
public void setNumero(int num1, int num2, int num3){
    if(num1>num2 && num1>num3) {
        System.out.println(num1+ " Es mayor ");
    } else if(num2>num1 && num2>num3){
        System.out.println(num2+ " Es mayor " );
    } else if(num3>num1 && num3>num2){
        System.out.println(num3+ " Es mayor ");
    }
}
}
