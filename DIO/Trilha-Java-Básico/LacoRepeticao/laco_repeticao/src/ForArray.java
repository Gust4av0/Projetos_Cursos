public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"joão", "joana", "ana", "Rafael"};

        for (int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }

        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
