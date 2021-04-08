package model;

public class Carro extends Vehiculo{

    private final int numeroPuertas;

    public Carro(Color color, String referencia, double velocidadMaxima, int numeroPuertas) {
        super(color, referencia, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(Vehiculo vehiculo, int numeroPuertas){
        super(vehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return  this.getClass().getName() + " -->" +
                " Numero de Puertas:" + numeroPuertas +
                super.toString();
    }
}
