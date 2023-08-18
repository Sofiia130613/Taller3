package ejercicio10;

public class Lienzo {
    private Dibujable[] elementos;

    public Lienzo(Dibujable[] elementos) {
        this.elementos = elementos;
    }

    public void dibujarTodo() {
        for (Dibujable elemento : elementos) {
            elemento.dibujar();
            System.out.println("------------------------------");
        }
    }
}
