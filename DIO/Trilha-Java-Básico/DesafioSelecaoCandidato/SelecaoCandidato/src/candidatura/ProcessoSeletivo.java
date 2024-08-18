package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidato(3000.0);
    }

    //MÉTODO
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        }else{
            System.out.println("AGUARDAR NOVO CANDIDATOS");
        }
    }
}