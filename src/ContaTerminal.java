import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();


        System.out.println("Por favor, digite o número da agência: ");
        scanner.nextLine();  // Consumir a nova linha pendente
        String agencia = scanner.nextLine();


        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


        scanner.close();
    }
}

