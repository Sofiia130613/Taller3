package ejercicio5;

 abstract class categoriaProducto {

    protected String nombre;

    public categoriaProducto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
