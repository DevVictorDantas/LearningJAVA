import java.util.Scanner;

public class Exemplo06 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double n1, n2, n3, media;

    System.out.println("Digite o valor da nota 1: ");
    n1 = input.nextDouble();
    System.out.println("Digite o valor da nota 2: ");
    n2 = input.nextDouble();
    System.out.println("Digite o valor da nota 3: ");
    n3 = input.nextDouble();

    media = (n1 + n2 + n3) / 3;

    if (media >= 7) {
      System.out.println("Sua média foi de " + media + ". Você foi aprovado");
    } else if (media < 4) {
      System.out.println("Sua média foi de " + media + ". Você foi reprovado");
    } else {
      System.out.println("Sua média foi de " + media + ". Você está de recuperação");
    }
  }
}