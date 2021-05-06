package factory.method;

import model.Avion;
import model.Avion.AvionBuilder;

public class AvionFactory implements VehiculoFactory {

    @Override
    public AvionBuilder crearVehiculo() {
        return Avion.builder();
    }
}
