public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >= 4 && nota < 7 ? "Exame" : "Reprovado";

        System.out.println(resultado);
    }
}