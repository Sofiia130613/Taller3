package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class sistemaNotificaciones {
    
    private List<notificacion> notificaciones = new ArrayList<>();

    public void agregarNotificacion(notificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public void enviarNotificaciones(String mensaje) {
        for (notificacion notificacion : notificaciones) {
            notificacion.enviar(mensaje);
        }
    }
   
}

