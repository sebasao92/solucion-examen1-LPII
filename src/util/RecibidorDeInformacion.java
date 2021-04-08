package util;

import model.*;
import util.Menu;

import java.util.Scanner;

public class RecibidorDeInformacion {

    private static final Scanner scanner = new Scanner(System.in);

    public static Vehiculo crearVehiculo() {
        System.out.println("Ingrese el color del vehiculo");
        int opcion = 0;
        Color color = null;
        do {
            Menu.menuColor();
            opcion = Validador.validarOpcion();
            color = elegirColor(opcion);
        }while (color == null);
        System.out.println("Ingrese la referencia del vehiculo");
        String referencia = scanner.nextLine();
        double velocidadMaxima = Validador.validarDouble("Ingrese la velocidad máxima");
        return new Vehiculo(Color.NEGRO, referencia, velocidadMaxima);
    }

    public static Avion crearAvion(){
        double altitudMaxima = Validador.validarDouble("Ingrese la altitud máxima");
        return new Avion(crearVehiculo(), altitudMaxima);
    }

    public static Yate crearYate(){
        double pesoMaximo = Validador.validarDouble("Ingrese el peso máximo");
        return new Yate(crearVehiculo(), pesoMaximo);
    }

    public static Carro crearCarro(){
        int numeroPuertas = Validador.validarInt("Ingrese el número de puertas");
        return new Carro(crearVehiculo(), numeroPuertas);
    }

    public static Vehiculo elegirVehiculo(int opcion){
        switch (opcion){
            case 1:
                return crearAvion();
            case 2:
                return crearCarro();
            case 3:
                return crearYate();
            case 4:
                System.out.println("Saliendo de la opción de agregado");
                return null;
            default:
                System.out.println("Opción no válida");
                return null;
        }
    }

    public static Color elegirColor(int opcion){
        switch (opcion){
            case 1:
                return Color.NEGRO;
            case 2:
                return Color.BLANCO;
            case 3:
                return Color.AZUL;
            case 4:
                return Color.VERDE;
            case 5:
                return Color.GRIS;
            default:
                System.out.println("Opción no válida");
                return null;
        }
    }
}
