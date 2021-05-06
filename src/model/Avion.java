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
        return this.getClass().getSimpleName() + " -->" +
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

        @Override
        public AvionBuilder color(Color color) {
            super.color(color);
            return this;
        }

        @Override
        public AvionBuilder referencia(String referencia) {
            super.referencia(referencia);
            return this;
        }

        @Override
        public AvionBuilder velocidadMaxima(double velocidadMaxima) {
            super.velocidadMaxima(velocidadMaxima);
            return this;
        }

        public Avion build() {
            return new Avion(this);
        }
    }

}
