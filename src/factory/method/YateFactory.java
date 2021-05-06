package factory.method;

import model.Color;
import model.Vehiculo;
import model.Yate;

public class YateFactory implements VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new Yate(Color.NEGRO, "", 20.0, 30.0);
    }
}
