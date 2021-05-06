package model;

public class Carro extends Vehiculo implements Cloneable {

    private final int numeroPuertas;

    public Carro(Color color, String referencia, double velocidadMaxima, int numeroPuertas) {
        super(color, referencia, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(Vehiculo vehiculo, int numeroPuertas){
        super(vehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(Carro carro){
        super(carro);
        this.numeroPuertas = carro.numeroPuertas;
    }

    public Carro(CarroBuilder carroBuilder) {
        super(carroBuilder);
        this.numeroPuertas = carroBuilder.numeroPuertas;
    }

    @Override
    public String toString() {
        return  this.getClass().getName() + " -->" +
                " Numero de Puertas:" + numeroPuertas +
                super.toString();
    }

    @Override
    protected Carro clone()  {
        return new Carro(this);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public static CarroBuilder builder(){
        return new CarroBuilder();
    }

    public static class CarroBuilder extends VehiculoBuilder {

        private int numeroPuertas;

        public CarroBuilder numeroPuertas(int numeroPuertas){
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        @Override
        public Carro build() {
            return new Carro(this);
        }
    }
}
