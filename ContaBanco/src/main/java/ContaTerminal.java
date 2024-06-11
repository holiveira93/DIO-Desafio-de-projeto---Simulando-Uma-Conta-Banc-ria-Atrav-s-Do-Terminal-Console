import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite a Agência!");
        agencia = scan.nextLine();

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo!");
        saldo = scan.nextDouble();

        System.out.println("==========================================================");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        scan.close();
    }
}
