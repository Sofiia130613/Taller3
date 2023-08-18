package ejercicio9;

public class Musica {

    public static void hacerTocarInstrumentos(InstrumentoMusical[] instrumentos) {
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = new Guitarra();
        instrumentos[1] = new Piano();
        instrumentos[2] = new Violin();

        hacerTocarInstrumentos(instrumentos);
    }
}
