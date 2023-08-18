package ejercicio2;

 abstract class notificacionBase implements notificacion{
    
    private String remitente;

    public notificacionBase(String remitente) {
        this.remitente = remitente;
    }

    public String getRemitente() {
        return remitente;
    }

    // Método común para todas las notificaciones
    public void mostrarEncabezado() {
        System.out.println("Remitente: " + remitente);
    }
}
