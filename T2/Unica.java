public class Unica {
    private static Unica unica;

    private Unica(){
    }

    public static Unica pegaInstancia(){
        if(unica == null){
            unica = new Unica();
        }

        return unica;
    }
}
