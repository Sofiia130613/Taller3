package ejercicio7;

public class ejercicio7 {
    
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo(2.5);
        formas[1] = new Triangulo(3.0, 6.7);
        formas[2] = new Cuadrado(5.0);

        for (Forma forma : formas) {
            System.out.println("El Área es: " + forma.calcularArea());
            System.out.println("-----------------------------");
        }
    }
}
