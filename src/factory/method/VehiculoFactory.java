package factory.method;

import model.Vehiculo;
import model.Vehiculo.VehiculoBuilder;

public interface VehiculoFactory {

    VehiculoBuilder crearVehiculo(Vehiculo vehiculo);
}
