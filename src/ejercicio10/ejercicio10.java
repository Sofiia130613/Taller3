package ejercicio10;

public class ejercicio10 {
     public static void main(String[] args) {
        Dibujable[] figuras = new Dibujable[3];
        figuras[0] = new Circulo();
        figuras[1] = new Rectangulo();
        figuras[2] = new Triangulo();

        Lienzo lienzo = new Lienzo(figuras);
        lienzo.dibujarTodo();
        
    }
}
