import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");

        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite a agência da conta !");

        String agenciaConta = scanner.next();

        System.out.println("Por favor, digite o nome do cliente !");

        String nomeCliente = scanner.next();

        if(scanner.hasNext()) {
            nomeCliente += scanner.nextLine();
        }

        System.out.println("Por favor, digite o saldo da conta !");

        double saldoConta = scanner.nextDouble();

        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
            nomeCliente, agenciaConta, numeroConta, saldoConta);

        System.out.println(mensagem);

        scanner.close();

    }
}
