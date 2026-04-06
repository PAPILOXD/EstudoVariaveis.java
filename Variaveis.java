public class MyClass {
  public static void main(String args[]) {
    String nome = "Alejandro";
    int idade = 25;
    double peso = 75;
    boolean matricula = true;
    
    System.out.println("DADOS DO ALUNO");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade + "anos");
    System.out.println("Peso: " + peso + "kg");
    System.out.println("Status da Matricula: " + (matricula ? "Ativo" : "Inativo"));
  }
}
