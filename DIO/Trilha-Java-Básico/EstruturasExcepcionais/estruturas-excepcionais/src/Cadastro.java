import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) throws Exception {
        try {
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = entradaUsuario.next();

        System.out.println("Informeu seu sobrenome: ");
        String sobrenome = entradaUsuario.next();

        System.out.println("Informeu sua idade: ");
        int idade = entradaUsuario.nextInt();

        System.out.println("Informeu seu CPF: ");
        int cpf = entradaUsuario.nextInt();

        System.out.println("Coletados os seguintes dados: ");
        System.out.println("-------------------------");
        System.out.println("Nome: " + nome + ", sobrenome: " + sobrenome + ", idade: " + idade + " e CPF: " + cpf);
        }catch(InputMismatchException a){
            System.out.println("Os campos idade, precisa ser número, e altura precisa se separado por (.)");
        }
    }
}
