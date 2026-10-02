import java.util.Scanner;
public class main {
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite um numero: ");

      int numero = scanner.nextInt();
      
    System.out.println("O numero digitado foi: " + numero);  
     scanner.close();
    }
}