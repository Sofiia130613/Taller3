package ejercicio2;

 class mensajesTexto  extends notificacionBase{
    public mensajesTexto(String remitente) {
        super(remitente);
    }
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje de texto: " + mensaje);
    }
    
}
