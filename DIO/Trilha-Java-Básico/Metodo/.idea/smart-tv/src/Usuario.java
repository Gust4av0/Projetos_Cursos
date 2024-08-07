public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.canal);
        smartTv.subirCanal();
        System.out.println(smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println(smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);


        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> " + smartTv.ligada);

        smartTv.desligar();;
        System.out.println("Novo Status -> " + smartTv.ligada);
    }
}
