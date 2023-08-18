package ejercicio1;

import java.util.Scanner;

public class triangulo{


    public float base=0;
    public float altura=0;
    public float area=0;
    public float perimetro=0;

    Scanner miCaptura= new Scanner(System.in);

    public float capturarBase(){
        System.out.println("Ingrese la base del triangulo: ");
        base=miCaptura.nextFloat();
        return base;
    }

    public float capturarAltura(){
        System.out.println("Ingrese la altura del triangulo, siendo este un triángulo equilatero: ");
        altura=miCaptura.nextFloat();
        return altura;
    }

    public float calcularArea(float base , float altura){
        area=base*altura/2;
        return area;
    }

    public float calcularPerimetro(float base){
        perimetro=base+base+base;
        return perimetro;
    }
    public void mostrarResultados(float area, float perimetro){
        System.out.printf("El área del circulo es %.2f : \n", area);
        System.out.printf("El perimetro del circulo es %.2f : \n", perimetro);
    }
}



