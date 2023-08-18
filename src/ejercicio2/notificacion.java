package ejercicio2;

interface notificacion {

    void enviar(String mensaje);    
    public static void main(String[] args) {
        sistemaNotificaciones sistema = new sistemaNotificaciones();

        correoElectronico correo = new correoElectronico("usuario@dominio.com");
        mensajesTexto mensajeTexto = new mensajesTexto("123456789");
        notificacionPush notificacionPush = new notificacionPush("MiApp");

        sistema.agregarNotificacion(correo);
        sistema.agregarNotificacion(mensajeTexto);
        sistema.agregarNotificacion(notificacionPush);

        String mensaje = "¡Hola! Este es un mensaje de prueba.";

        sistema.enviarNotificaciones(mensaje);
    }
}
