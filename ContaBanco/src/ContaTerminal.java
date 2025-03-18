import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite o número da sua Agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número da sua Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do seu Saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
