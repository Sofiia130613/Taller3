package ejercicio5;

public class Camiseta implements Producto{

    private String marca;
    private double precio;
     private Ropa categoria;

    public Camiseta(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
        this.categoria = new Ropa();
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: " + categoria.getNombre());
        System.out.println("Marca: " + marca);
        System.out.println("Precio: $" + precio);
    }
    
}
