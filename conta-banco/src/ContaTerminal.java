import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo atual: ");
        Double saldoAtual = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoAtual + " já está disponível para saque");

        scanner.close();


    }
}
