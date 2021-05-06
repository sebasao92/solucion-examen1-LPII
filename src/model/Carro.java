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
}
