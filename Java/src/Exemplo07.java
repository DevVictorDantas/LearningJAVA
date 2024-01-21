import java.util.Scanner;

public class Exemplo07 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int numero;

    System.out.println("Digite uma opção de 1 a 3: ");
    numero = input.nextInt();

    switch (numero) {
      case 1:
        System.out.println("Você deseja coca cola");
        break;
      case 2:
        System.out.println("Você deseja guaraná");
        break;
      case 3:
        System.out.println("Você deseja fanta laranja");
        break;

      default:
        System.out.println("Alternativa inválida");
        break;
    }
  }
}
