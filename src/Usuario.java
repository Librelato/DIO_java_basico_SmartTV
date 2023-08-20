public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv ligada?: " + smartTV.ligada);
        System.out.println("Canal atual?: " + smartTV.canal);
        System.out.println("Volume atual?: " + smartTV.volume);

    }
}
