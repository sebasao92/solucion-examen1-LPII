package util;

import exception.GarajeException;
import model.Vehiculo;

import java.util.Objects;

public class Garaje {

    public static final int NUMERO_MAXIMO_DE_VEHICULOS = 1;
    private final Vehiculo[] vehiculos = new Vehiculo[NUMERO_MAXIMO_DE_VEHICULOS];
    public static final String MENSAJE_DE_ERROR_DE_GARAJE_LLENO = "El garaje está lleno";

    public void agregarVehiculo(Vehiculo nuevoVehiculo){
        if(Objects.nonNull(nuevoVehiculo)) {
            if (estaElGarajeLleno()) {
                throw new GarajeException(MENSAJE_DE_ERROR_DE_GARAJE_LLENO);
            }
            int celdaDisponible = encontrarEspacioDisponible();
            vehiculos[celdaDisponible] = nuevoVehiculo;
        }
    }

    public void mostrarVehiculos(){
        for(int i = 0; i< vehiculos.length; i++){
            if(vehiculos[i] != null) {
                System.out.println((i + 1) + ". " + vehiculos[i]);
            }
        }
    }

    public int encontrarEspacioDisponible(){
        for(int i = 0; i<vehiculos.length; i++){
            if(vehiculos[i] == null){
                return i;
            }
        }
        return -1;
    }

    public boolean estaElGarajeLleno(){
        return encontrarEspacioDisponible() == -1;
    }
}
