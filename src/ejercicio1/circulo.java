package ejercicio1;

import java.util.Scanner;
import java.lang.Math;

public class circulo{
    
    public float radio=0;
    public float area =0;
    public float perimetro=0;

    Scanner miCaptura= new Scanner(System.in);

    public float capturarRadio(){
        System.out.println("Ingrese el radio del circulo");
        radio=miCaptura.nextFloat();
        return radio;
    }

    public float calcularArea(float radio){
        area=(float)Math.PI*(float)Math.pow(radio, 2);
        return area;
    }

    public float calcularPerimetro(float radio){
        perimetro=2*(float)Math.PI*radio;
        return perimetro;
    }

    public void mostrarResultados(float area, float perimetro){
        System.out.printf("El área del circulo es %.2f :", area);
        System.out.printf("El perimetro del circulo es %.2f :", perimetro);
    }
}