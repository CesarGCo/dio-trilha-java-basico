import java.util.Locale;
import java.util.Scanner;

public class CriaConta {

    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da conta!");
        conta.atribuiNumero(scanner.nextInt());

        System.out.println("Digite o número da agência!");
        conta.atribuiAgencia(scanner.next());

        System.out.println("Digite o seu nome!");
        conta.atribuiNome(scanner.next());

        System.out.println("Digite o saldo que deseja adicionar a conta!");
        conta.atribuiSaldo(scanner.nextDouble());

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numeroConta + " e seu saldo de " + conta.saldo + " já está disponível para saque!");
    }

}
