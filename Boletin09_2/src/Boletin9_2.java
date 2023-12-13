public class Boletin9_2 {
  private static int sum=0; //acumulador de suma
  private static int prod=1; //acumulador de producto

  public static void calcularOperaciones() {
    int i = 10;

    while (i < 90) {
      sum += i;
      prod *= i;
      i++;
      System.out.println("la suma= " + sum + " el producto= " + prod);
    }
  }
}
