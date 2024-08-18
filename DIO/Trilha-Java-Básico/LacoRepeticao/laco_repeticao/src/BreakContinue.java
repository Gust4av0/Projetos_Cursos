public class BreakContinue {
    public static void main(String[] args) {
        for(int cont = 1; cont <= 5; cont++){
            if(cont == 3){
                break;
                
            }
            System.out.println(cont);
        }
        System.out.println("-----------------------------------------------------");
        for(int cont2 = 1; cont2 <= 5; cont2++){
            if(cont2 == 3){
                continue;
                
            }
            System.out.println(cont2);
        }
    }
}
