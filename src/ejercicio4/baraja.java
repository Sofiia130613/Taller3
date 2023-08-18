package ejercicio4;

public class baraja {

    private carta cartas[];
    private int posSiguienteCarta;

    public static final int num_cartas=40;
    
    
    public baraja() {
    this.cartas=new carta[num_cartas];
    this.posSiguienteCarta=0;
    crearBaraja();
    barajar();
    }
    public void crearBaraja(){
        String [] palos=carta.PALOS;
        for(int i=0;i<palos.length;i++){
            for(int j=0; j<carta.limite_carta_palo;j++){
                if(!(j==7 || j==8)){
                    if(j>9){
                        cartas[((i*(carta.limite_carta_palo-2))+ (j-2))] = new carta(j+1,palos[i]);
                    }else{
                        cartas[((i*(carta.limite_carta_palo-2))+ j)] = new carta(j+1,palos[i]);
                    }

                }
            }
        }
    }
    public void barajar(){


        int posAleatoria =0;
        carta c;

        for(int i =0; i< cartas.length;i++){
            c=cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria]= c;

        }
    }
    public carta siguienteCarta(){

        carta c=null;

        if(posSiguienteCarta == num_cartas){
            System.out.println("Ya no hay mas cartas, baraja de nuevo");
        }else{
            c = cartas[posSiguienteCarta];
            posSiguienteCarta++;
        }
        return c;

    }
    public carta [] darCarta(int numCartas){
        if(numCartas> num_cartas){
            System.out.println("No se pueden dar mas cartas de las que hay");
            
        }else{
            if(cartasDisponible()<numCartas){
                System.out.println("No hay mas cartas que mmostrar");
            }else{
                carta[] cartasDar = new carta[numCartas];

                for(int i=0;i<cartasDar.length;i++){
                    cartasDar[i]=siguienteCarta();
                }
                return cartasDar;
            }
        }
        return null;
    }
    public int cartasDisponible(){
        return num_cartas-posSiguienteCarta;
    }

    public void cartasMonton(){
        if(cartasDisponible()==num_cartas){
            System.out.println("No se ha sacado ninguna carta");
        }else{
            for(int i=0;i<posSiguienteCarta;i++){
                System.out.println(cartas[i]);
            }
        }
        
    }

    public void mostrarBajara(){
         if(cartasDisponible()==0){
            System.out.println("No hay cartas que mostrar");
        }else{
            for(int i=posSiguienteCarta;i<cartas.length;i++){
                System.out.println(cartas[i]);
            }
        }
    }
}
