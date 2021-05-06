package factory.method;

import model.Avion;
import model.Color;
import model.Vehiculo;

public class AvionFactory implements VehiculoFactory {

    @Override
    public Vehiculo crearVehiculo() {
        return new Avion(Color.NEGRO, "",20.0, 10.0);
    }
}
