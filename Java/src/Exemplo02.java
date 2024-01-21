import java.util.Scanner;

public class Exemplo02 {
  public static void main(String[] args) {

    int valor;

    Scanner teclado = new Scanner(System.in); //cria uma entrada padrão que no caso é o teclado

    System.out.println("Digite um valor: ");
    valor = teclado.nextInt(); // aqui ele pegou a variável valor e atribuiu a ela um valor captado que foi digitado pelo cliente

    System.out.println(valor / 2);
    System.out.println(valor % 2);
  }
}
