
package boletin.pkg23;

public class Ejercicios {
    private String texto1 = "Esto es java";
    private String texto2 = "JAVA";
    private String texto3 = "Java desde 0";
    private String texto4 = "James Gosling created Java";
    private String texto5 = "java java java";
    private String texto6 = "www.javadesde0.com";
    private String texto7 = "Javeros";
    private String texto8_1 = "Java";
    private String texto8_2 = "JavaScript";
    private String texto9 = "jeve jeve jeve";
    private String texto10 = "ABCD";
    private String texto11 = "Hola, soy alumno de DAM1, y soy programador desde el 2021";
    
    public void ejer1(){
        System.out.println("EJERCICIO 1: \nLa longitud del texto es " +texto1.length()+"\n");
    }
    
    public void ejer2(){
        System.out.println("EJERCICIO 2:");
        for(int i=0; i<texto2.length();i++){
            char letras;
            letras = texto2.charAt(i);
            System.out.println(letras);
        }
    }
    
    public void ejer3(){
        String invertido = " ";
        for(int i=texto3.length() - 1; i >=0; i--){
            invertido = invertido + texto3.charAt(i);
            }
           System.out.println("\nEJERCICIO 3: \nEl texto invertido es: " +invertido+"\n");
    }
    
    public void ejer4(){
        System.out.println("EJERCICIO 4: \nSe borro los espacios de este texto: " +texto4.replace(" ","")+"\n");
    }
    
    public void ejer5(){
        int vocales=0;
        int consonantes=0;
        
        for(int i=0; i<texto5.length(); i++){
            char letra = texto5.charAt(i);
            
            if(Character.isLetter(letra)){
            if(letra =='a'||letra =='e'||letra =='i'||letra =='o'||letra =='u'){
                vocales++;
            }else {
                consonantes++;
            }    
            }
        }
        System.out.println("EJERCICIO 5: \nNumero de vocales: " +vocales);
        System.out.println("Numero de consonantes: " +consonantes+"\n");
    }
    
    public void ejer6(){
        //Dividimos el texto en dos partes
        String parte1 = texto6.substring(0, 8); // www.java
        String parte2 = texto6.substring(8); // desde0.com
        
        //Juntamos
        String completo = parte1 + parte2;
        
        //visualizamos
        System.out.println("EJERCICIO 6: \nTexto completo: " +texto6);
        System.out.println("Primera parte del texto: "+parte1);
        System.out.println("Segunda parte del texto: "+parte2);
        System.out.println("Las dos partes del texto: "+completo+ "\n");
    }
    
    public void ejer7(){
        System.out.println("EJERCICIO 7: \nTexto en minusculas: " +texto7.toLowerCase());
        System.out.println("Texto en mayusculas: " +texto7.toUpperCase()+"\n");
    }
    
    public void ejer8(){
        //comparamos si son iguales ambos textos
        boolean comparamos = texto8_1.equals(texto8_2);
        
        if(comparamos){
            System.out.println("EJERCICIO 8: \nLos textos son iguales");
        }else{
            System.out.println("EJERCICIO 8: \nLos textos son diferentes\n");
        }
    }
    
    public void ejer9(){
        String cambio = texto9.replaceAll("e", "a");
        System.out.println("EJERCICIO 9: \nTexto original: " +texto9+ " \nTexto cambiado e por a: " +cambio+ "\n");
    }
    
    public void ejer10(){
        System.out.println("EJERCICIO 10:");
        for(int i=0; i<texto10.length(); i++){
            char caracter = texto10.charAt(i);
            int valorASCII = (int) caracter;
            System.out.println("Caracter: " +caracter+ ", valor ASCII: "+valorASCII);  
        }
    }
    
    public void ejer11(){
        int letras = 0;
        int digitos = 0;
        int espacios = 0;
        
        for(char caracter : texto11.toCharArray()){
            if(Character.isLetter(caracter)){
                letras++;
            }else if(Character.isDigit(caracter)){
                digitos++;
            }else if(Character.isWhitespace(caracter)){
                espacios++;
            }
        }System.out.println("\nEJERCICIO 11: \n" +texto11);
        System.out.println("Números de letras: "+letras);
        System.out.println("Números de dígitos: "+digitos);
        System.out.println("Números de espacios en blanco: "+espacios);
    }
}

