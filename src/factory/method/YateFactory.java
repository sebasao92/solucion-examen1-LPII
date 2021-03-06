package factory.method;

import model.Vehiculo;
import model.Yate;
import model.Yate.YateBuilder;

public class YateFactory implements VehiculoFactory {

    @Override
    public YateBuilder crearVehiculo(Vehiculo vehiculo) {
        return Yate.builder()
                .color(vehiculo.getColor())
                .referencia(vehiculo.getReferencia())
                .velocidadMaxima(vehiculo.getVelocidadMaxima());
    }
}
