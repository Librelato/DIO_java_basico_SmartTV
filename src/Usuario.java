public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv ligada?: " + smartTV.ligada);
        System.out.println("Canal atual?: " + smartTV.canal);
        System.out.println("Volume atual?: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Tv ligada?: " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume atual?: " + smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("Canal atual?: " + smartTV.canal);

    }
}
