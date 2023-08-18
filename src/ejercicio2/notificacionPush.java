package ejercicio2;

 class notificacionPush extends notificacionBase{
    public notificacionPush(String remitente) {
        super(remitente);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
    
}
