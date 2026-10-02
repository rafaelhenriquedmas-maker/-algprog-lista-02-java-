import java.util.Scanner;

public class valor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PLANEJADOR DE VIAGEM: EUROTRIP ===");

        
        System.out.print("Digite o valor gasto na Alemanha (R$): ");
        double custoAlemanha = scanner.nextDouble();

        System.out.print("Digite o valor gasto em Portugal (R$): ");
        double custoPortugal = scanner.nextDouble();

        System.out.print("Digite o valor gasto na Itália (R$): ");
        double custoItalia = scanner.nextDouble();

      
        System.out.print("Digite a quantidade de amigos no grupo: ");
        int quantidadeAmigos = scanner.nextInt();

        double valorTotal = custoAlemanha + custoPortugal + custoItalia;
        double valorPorPessoa = valorTotal / quantidadeAmigos;

      
        System.out.println("\n--- RESUMO DO ORÇAMENTO ---");
        System.out.println("Custo Total da Eurotrip: R$ " + valorTotal);
        System.out.println("Valor individual (" + quantidadeAmigos + " pessoas): R$ " + valorPorPessoa);

        scanner.close();
    }
}