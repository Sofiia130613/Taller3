package ejercicio4;

public class ejercicio4 {
    
    public static void main (String[] args){
        baraja b =new baraja();
        b.mostrarBajara();

        carta[] c = b.darCarta(4);

        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }


    }
}
