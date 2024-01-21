import java.util.Scanner;

public class Exemplo05 {
  public static void main(String[] args) {

    int idade;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    idade = teclado.nextInt();

    if (idade >= 18)
      System.out.println("Você tem " + idade + " anos! DEVE votar.");
    else if (idade >= 16) {
      System.out.println("Você tem " + idade + " anos! PODE votar.");
    } else {
      System.out.println("Você não pode votar.");
    }
  }
}
