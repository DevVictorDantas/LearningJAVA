public class Exemplo13 {
  public static void main(String[] args) {

    int[] nota = new int[3]; // {9, 10, 8} também funciona - array

    nota[1] = 10;
    nota[2] = 8;
    nota[0] = 9;
    /*
     * caso seja declarado da forma "2" não usa essa declaração de valores por
     * posições
     */

    for (int i = 0; i < 3; i++)
      System.out.println(nota[i]);
    // outra forma é for (int valor:nota)
    // System.out.println(valor)

  }

}