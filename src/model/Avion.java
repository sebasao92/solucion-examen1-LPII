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

    public Avion(AvionBuilder avionBuilder) {
        super(avionBuilder);
        this.altitudMaxima = avionBuilder.altitudMaxima;
    }

    @Override
    public String toString() {
        return  this.getClass().getName() + " -->" +
                " Altitud Máxima:" + altitudMaxima +
                super.toString();
    }

    public static AvionBuilder builder() {
        return new AvionBuilder();
    }

    public static class AvionBuilder extends VehiculoBuilder {

        private double altitudMaxima;

        public AvionBuilder altitud(double altitudMaxima) {
            this.altitudMaxima = altitudMaxima;
            return this;
        }

        public Avion build() {
            return new Avion(this);
        }
    }

}
