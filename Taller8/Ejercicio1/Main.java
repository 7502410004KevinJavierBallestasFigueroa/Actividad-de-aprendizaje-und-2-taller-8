package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("________________________________________________");
        Vehiculo vehiculo1 = new Vehiculo("Renault", 120);
        System.out.println("Datos del vehiculo1");
        vehiculo1.mostrarInformacion();
        System.out.println("________________________________________________");
        Coche coche1 = new Coche("Chevrolet", 130, 4);
        System.out.println("Datos del coche1");
        coche1.mostrarInformacion();
    }
}

