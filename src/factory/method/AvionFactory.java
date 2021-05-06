package factory.method;

import model.Avion;
import model.Avion.AvionBuilder;
import model.Vehiculo;

public class AvionFactory implements VehiculoFactory {

    @Override
    public AvionBuilder crearVehiculo(Vehiculo vehiculo) {
        return Avion.builder()
                .color(vehiculo.getColor())
                .referencia(vehiculo.getReferencia())
                .velocidadMaxima(vehiculo.getVelocidadMaxima());
    }
}
