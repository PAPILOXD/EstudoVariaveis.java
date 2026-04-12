import java.util.Scanner;

public class CalculadoraIMC {

  
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * 2);
    }

    public static void classificarIMC(double imc) {
        if (imc < 18) {
            System.out.println("Baixo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc > 30.0) {
            System.out.println("Obesidade");
        } else {
            System.out.println("Valor fora da tabela.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Seu IMC é: " + imc);
        classificarIMC(imc);

        scanner.close();
    }
}
