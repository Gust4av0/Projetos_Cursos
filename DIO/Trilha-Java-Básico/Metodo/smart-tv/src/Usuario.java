public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + SmartTv.ligada);
        smartTv.ligar();
        System.out.println("TV Ligada? " + SmartTv.ligada);
    }


}
