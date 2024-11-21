package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Kevin", 4000000);
        System.out.println(empleado.mostrarDetalles());

        Gerente gerente = new Gerente("German", 8000000, "Salud publica");
        System.out.println(gerente.mostrarDetalles());
    }
}

