public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    //MUDAR CANAL
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }
    public void subirCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    //DIMINUIR VOLUME
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    //LIGAR OU DESLIGAR TV
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}