package factory.method;

import model.Vehiculo.VehiculoBuilder;
import model.Yate;

public class YateFactory implements VehiculoFactory {

    @Override
    public VehiculoBuilder crearVehiculo() {
        return Yate.builder();
    }
}
