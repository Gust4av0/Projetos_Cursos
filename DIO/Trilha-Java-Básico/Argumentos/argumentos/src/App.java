import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu nome: ");
        String nome = entrada.next();

        System.out.println("Insira seu sobrenome: ");
        String sobrenome = entrada.next();

        System.out.println("Insira sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Insira sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Me chamo: " + nome + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Tenho " + altura + " de altura");
    }
}