package ejercicio5;

public class Tienda {
    
    public static void main(String[] args) {
        Producto televisor = new Televisor("Samsung XYZ", 799.99);
        Producto camiseta = new Camiseta("Nike", 29.99);
        Producto novela = new Novela("Cien años de soledad", "Gabriel García Márquez", 14.99);

        televisor.mostrarDetalles();
        System.out.println("Precio Total: $" + televisor.calcularPrecio());

        camiseta.mostrarDetalles();
        System.out.println("Precio Total: $" + camiseta.calcularPrecio());

        novela.mostrarDetalles();
        System.out.println("Precio Total: $" + novela.calcularPrecio());
    }
}
