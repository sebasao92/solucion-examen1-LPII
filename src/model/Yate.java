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
        return  this.getClass().getName() + " -->" +
                " Peso Máximo:" + pesoMaximo +
                super.toString();
    }

    public static YateBuilder yateBuilder(){
        return new YateBuilder();
    }

    public static class YateBuilder extends VehiculoBuilder {

        private double pesoMaximo;

        public YateBuilder pesoMaximo(double pesoMaximo) {
            this.pesoMaximo = pesoMaximo;
            return this;
        }

        @Override
        public Yate build() {
            return new Yate(this);
        }
    }
}
