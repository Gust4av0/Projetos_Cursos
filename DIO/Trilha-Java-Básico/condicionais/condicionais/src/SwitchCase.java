import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma categoria: P, M ou G");
        String entradaUsuario = entrada.next();

        switch (entradaUsuario) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Não definido!");
        }
    }
}