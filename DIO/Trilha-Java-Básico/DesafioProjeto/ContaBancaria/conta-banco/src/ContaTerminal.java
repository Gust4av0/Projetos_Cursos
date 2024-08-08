import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nome;
        double saldo = 1000.50; 

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        conta = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = entrada.next();
        System.out.println("Por favor, digite seu Nome: ");
        nome = entrada.next();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + ", e seu saldo " + saldo + ", já está disponível para saque.");
    }
}
