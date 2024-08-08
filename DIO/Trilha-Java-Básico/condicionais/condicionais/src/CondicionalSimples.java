public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
        double saldoDiponivel = 500.00;
        double saque = 487.53;

        if (saque < saldoDiponivel) {
            saldoDiponivel = saldoDiponivel - saque;
            System.out.println("Saque realizado no valor de: " + "R$" +saque + ", saldo restante: " + "R$" + saldoDiponivel);
        }
    }
}