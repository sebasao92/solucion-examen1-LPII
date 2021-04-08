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

    @Override
    public String toString() {
        return  this.getClass().getName() + " -->" +
                " Peso Máximo:" + pesoMaximo +
                super.toString();
    }
}
