public class Exemplo15 {
  public static void main(String[] args) {

    Aluno objeto = new Aluno();

    objeto.nome = "Victor";
    objeto.teste = 9;
    objeto.prova = 10;

    System.out.println(objeto.obterMedia());
  }
}
