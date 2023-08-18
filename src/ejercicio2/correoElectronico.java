package ejercicio2;

public class correoElectronico extends notificacionBase{
    public correoElectronico(String remitente) {
        super(remitente);
    }
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
    
}
