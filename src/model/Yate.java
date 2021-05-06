package model;

public class Yate extends Vehiculo {

    private final double pesoMaximo;

    public Yate(Color color, String referencia, double velocidadMaxima, double pesoMaximo) {
        super(color, referencia, velocidadMaxima);
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(Vehiculo vehiculo, double pesoMaximo) {
        super(vehiculo);
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(YateBuilder yateBuilder) {
        super(yateBuilder);
        this.pesoMaximo = yateBuilder.pesoMaximo;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + " -->" +
                " Peso Máximo:" + pesoMaximo +
                super.toString();
    }

    public static YateBuilder builder(){
        return new YateBuilder();
    }

    public static class YateBuilder extends VehiculoBuilder {

        private double pesoMaximo;

        public YateBuilder pesoMaximo(double pesoMaximo) {
            this.pesoMaximo = pesoMaximo;
            return this;
        }

        @Override
        public YateBuilder color(Color color) {
            super.color(color);
            return this;
        }

        @Override
        public YateBuilder referencia(String referencia) {
            super.referencia(referencia);
            return this;
        }

        @Override
        public YateBuilder velocidadMaxima(double velocidadMaxima) {
            super.velocidadMaxima(velocidadMaxima);
            return this;
        }

        @Override
        public Yate build() {
            return new Yate(this);
        }
    }
}
