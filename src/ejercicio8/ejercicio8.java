package ejercicio8;

public class ejercicio8 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new EmpleadoAsalariado("Santiago Mendoza", 7000);
        empleados[2] = new EmpleadoPorHoras("Kim Namjoon", 15, 50);

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: $" + empleado.calcularSalario());
            System.out.println("-----------------------------");
        }
    }
}
