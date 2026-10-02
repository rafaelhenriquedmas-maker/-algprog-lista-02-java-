import java.util.Scanner;

public class gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o preço do litro da gasolina (R$): ");
        double precoLitro = scanner.nextDouble();

        
        System.out.print("Digite a quantidade de litros vendida: ");
        double litrosVendidos = scanner.nextDouble();

        
        double totalPagar = precoLitro * litrosVendidos;

        
        System.out.println("\nTotal a pagar: R$ " + totalPagar);

        scanner.close();
    }
}