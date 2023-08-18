package ejercicio1;

import java.util.Scanner;

public class aplicacionCalculoAreaPerimetro {
    public static void main (String[] args){
    
    float baseTriangulo=0;
    float alturaTriangulo=0;
    float radioCirculo=0;
    float areaMain=0;
    float perimetroMain=0;
    int decision=0;

    Scanner miCaptura= new Scanner(System.in);

    System.out.printf("Elija la figura a calcular: \n");
    System.out.printf("1. Para Triangulo \n");
    System.out.printf("2. Para Circulo \n");
    System.out.printf("3. Para Terminar operación \n");
    decision=miCaptura.nextInt();

    ejercicio1.triangulo miTriangulo;
    switch (decision) {
        case 1:

        System.out.printf("Eligio triangulo \n");

        Object triangulo = miTriangulo = new triangulo();
        baseTriangulo=miTriangulo.capturarBase();
        alturaTriangulo=miTriangulo.capturarAltura();
        areaMain=miTriangulo.calcularArea(baseTriangulo,alturaTriangulo);
        perimetroMain=miTriangulo.calcularPerimetro(baseTriangulo);
        miTriangulo.mostrarResultados(areaMain,perimetroMain);
            break;
        case 2:
        
        System.out.printf("Eligio circulo \n");

            ejercicio1.circulo miCirculo;
            Object circulo = miCirculo = new circulo();
        radioCirculo=miCirculo.capturarRadio();
        areaMain=miCirculo.calcularArea(radioCirculo);
        perimetroMain=miCirculo.calcularPerimetro(radioCirculo);
        miCirculo.mostrarResultados(areaMain,perimetroMain);
        break;
        case 3:
        System.out.println("Eligio terminar \n");
        default:
        System.out.println("Operación no válida");
            break;
    }
    miCaptura.close();
}
}
