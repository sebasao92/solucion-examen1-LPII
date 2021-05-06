package util;

import model.Color;
import model.Vehiculo;
import util.recibidor.RecibidorDeInformacionUno;
import util.validador.ValidadorUno;

import java.util.Objects;

public class Menu {

    private static Menu instancia;
    private final Garaje garaje = new Garaje();

    private Menu(){ }

    public void mostrarMenu(){
        System.out.println("Bienvenido al garaje");
        System.out.println("1. Agregar vehiculo");
        System.out.println("2. Mostrar vehiculos");
        System.out.println("3. Salir");
    }

    public void correrMenu(){
        int opcion = 0;
        do{
            mostrarMenu();
            opcion = ValidadorUno.validarOpcion();
            elegirOperacion(opcion);
        }while(opcion != 3);
    }

    public void menuVehiculos(){
        System.out.println("¿Qué vehiculo quiere agregar?");
        System.out.println("1. Avion");
        System.out.println("2. Carro");
        System.out.println("3. Yate");
        System.out.println("4. Salir");
    }

    public Vehiculo correrMenuAgregarVehiculo(){
        int opcion = 0;
        Vehiculo vehiculo = null;
        do{
            menuVehiculos();
            opcion = ValidadorUno.validarOpcion();
            vehiculo = RecibidorDeInformacionUno.elegirVehiculo(opcion);
        }while (opcion != 4 && vehiculo == null);
        return vehiculo;
    }

    public static void menuColor(){
        System.out.println("1. " + Color.NEGRO);
        System.out.println("2. " + Color.BLANCO);
        System.out.println("3. " + Color.AZUL);
        System.out.println("4. " + Color.VERDE);
        System.out.println("5. " + Color.GRIS);
    }

    public void elegirOperacion(int opcion){
        switch (opcion){
            case 1:
                Vehiculo nuevoVehiculo = null;
                if(!garaje.estaElGarajeLleno()) {
                    System.out.println("Agregando vehiculos...");
                    nuevoVehiculo = correrMenuAgregarVehiculo();
                    garaje.agregarVehiculo(nuevoVehiculo);
                } else {
                    System.out.println(Garaje.MENSAJE_DE_ERROR_DE_GARAJE_LLENO);
                }
                break;
            case 2:
                System.out.println("Mostrando vehiculos...");
                garaje.mostrarVehiculos();
                break;
            case 3:
                System.out.println("Gracias por utilizar nuestra app");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static Menu getInstance(){
        return Objects.isNull(instancia) ? new Menu() : instancia;
    }
}
