package ejercicio4;

public class carta {
    
    private int numero;
    private String palo;

    public static final String[] PALOS={"ESPADAS","OROS","COPAS","BASTOS"};
    public static final int limite_carta_palo=12;

    public carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo ;
    }
    
}
