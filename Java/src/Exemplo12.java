import java.util.Scanner;

public class Exemplo12 {
  public static void main(String[] args) {

    String name;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    name = input.nextLine();

    System.out.println("Aluno " + name);
  }
}
