import java.util.Scanner;
public class CalculadoraOperadores {
  public static void main(String args[]) {
    Scanner scanner = new Scanner (System.in);
    
     System.out.print("DIGITE O PRIMER NÚMERO: ");
     double num1 = scanner.nextDouble();
     
     System.out.print("DIGITE O SEGUNDO NÚMERO: ");
     double num2 = scanner.nextDouble();
     
     double soma = num1 + num2;
     double subtracao = num1 + num2;
     double multiplicacao = num1 * num2;
     double divisao = num1 / num2;
     
     
      System.out.print("RESULTADOS\n");
      
      System.out.print("Soma: " + soma + " \n");
      
      System.out.print("Substração: " + subtracao + "\n");
      
      System.out.print("Multiplicação: " + multiplicacao + "\n");
      
      System.out.print("Divisão: " + divisao + "\n");
      
      scanner.close();
