package ejercicio5;

public class Novela implements Producto{
    private String titulo;
    private String autor;
    private double precio;
    private Libros categoria;

    public Novela(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = new Libros();
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: " + categoria.getNombre());
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }
}
