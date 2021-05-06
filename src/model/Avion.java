package model;

public class Avion extends Vehiculo {

    private final double altitudMaxima;

    public Avion(Color color, String referencia, double velocidadMaxima, double altitudMaxima) {
        super(color, referencia, velocidadMaxima);
        this.altitudMaxima = altitudMaxima;
    }

    public Avion(Vehiculo vehiculo, double altitudMaxima) {
        super(vehiculo);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public String toString() {
        return  this.getClass().getName() + " -->" +
                " Altitud Máxima:" + altitudMaxima +
                super.toString();
    }


}
