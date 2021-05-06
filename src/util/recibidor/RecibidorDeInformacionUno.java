package util.recibidor;

import factory.method.AvionFactory;
import factory.method.CarroFactory;
import factory.method.YateFactory;
import model.*;
import util.Menu;
import util.validador.ValidadorUno;

import java.util.Scanner;

public class RecibidorDeInformacionUno implements RecibidorDeInformacion {

    private static final Scanner scanner = new Scanner(System.in);

    public static Vehiculo crearVehiculo() {
        System.out.println("Ingrese el color del vehiculo");
        int opcion = 0;
        Color color = null;
        do {
            Menu.menuColor();
            opcion = ValidadorUno.validarOpcion();
            color = elegirColor(opcion);
        }while (color == null);
        System.out.println("Ingrese la referencia del vehiculo");
        String referencia = scanner.nextLine();
        double velocidadMaxima = ValidadorUno.validarDouble("Ingrese la velocidad máxima");

        return Vehiculo.builder()
                .color(Color.NEGRO)
                .referencia(referencia)
                .velocidadMaxima(velocidadMaxima)
                .build();
    }

    public static Avion crearAvion(){
        double altitudMaxima = ValidadorUno.validarDouble("Ingrese la altitud máxima");
        return new AvionFactory().crearVehiculo(crearVehiculo())
                .altitud(altitudMaxima)
                .build();
    }

    public static Yate crearYate(){
        double pesoMaximo = ValidadorUno.validarDouble("Ingrese el peso máximo");
        return new YateFactory().crearVehiculo(crearVehiculo())
                .pesoMaximo(pesoMaximo)
                .build();
    }

    public static Carro crearCarro(){
        int numeroPuertas = ValidadorUno.validarInt("Ingrese el número de puertas");
        return new CarroFactory().crearVehiculo(crearVehiculo())
                .numeroPuertas(numeroPuertas)
                .build();
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
