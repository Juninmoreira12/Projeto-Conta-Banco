import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Menssagem de boas vindas
        System.out.println("Olá seja bem-vindo ao banco Moneytalks!");
        System.out.println("Iremos criar uma conta para você é super simples e facil");

        //Entrada do nome do cliente
        System.out.println("Por favor, digite seu primeiro nome:");
        String primeiroNome = scanner.next();
        System.out.println("Agora, por favor, digite seu sobrenome:");
        String segundoNome = scanner.next();

        String nomeCliente = nomeCliente(primeiroNome, segundoNome);

        //Entrada do numero da agência do cliente
        System.out.println("Por favor digite o numero de sua agência");
        String agencia = scanner.next();

        //Entrada do numero da conta do cliente
        System.out.println("Por favor digite o numero da sua conta");
        int conta = scanner.nextInt();

        //Entrada do numero do valor depositado pelo cliente
        System.out.println("Por favor deposite um valor desejado");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +" , obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + " , conta" + conta + " e seu saldo " + saldo + " já está disponível para saque."
        );
    }

    public static String nomeCliente (String primeiroNome, String segundoNome){

               return primeiroNome.concat(" ").concat(segundoNome);
    }
}
