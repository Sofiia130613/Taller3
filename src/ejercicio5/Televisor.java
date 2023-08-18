package ejercicio5;

public class Televisor implements Producto{

    private String modelo;
    private double precio;
    private Electronica categoria;

    public Televisor(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
        this.categoria = new Electronica();
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: " + categoria.getNombre());
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
    }
}
