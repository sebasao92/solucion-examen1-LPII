package factory.method;

import model.Carro;
import model.Carro.CarroBuilder;
import model.Vehiculo;

public class CarroFactory implements VehiculoFactory {

    @Override
    public CarroBuilder crearVehiculo(Vehiculo vehiculo) {
        return Carro.builder()
                .color(vehiculo.getColor())
                .referencia(vehiculo.getReferencia())
                .velocidadMaxima(vehiculo.getVelocidadMaxima());
    }
}
