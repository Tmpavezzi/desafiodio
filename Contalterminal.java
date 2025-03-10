import java.sql.SQLOutput;
import java.util.Scanner;

public class Contalterminal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor , digite o numero da Conta ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor , digite o  numero da Agencia ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor , digite seu Nome ");
        String nomecliente = scanner.nextLine();

        System.out.println("Por favor, digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomecliente, agencia, numero, saldo);

        scanner.close();


    }
}
