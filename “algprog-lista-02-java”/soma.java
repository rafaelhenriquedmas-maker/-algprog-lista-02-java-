import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;

        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);

       
        scanner.close();
    }
}