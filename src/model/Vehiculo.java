package model;

public class Vehiculo {

    private final Color color;
    private final String referencia;
    private final double velocidadMaxima;

    public Vehiculo(Color color, String referencia, double velocidadMaxima) {
        this.color = color;
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(Vehiculo vehiculo){
        this.color = vehiculo.getColor();
        this.velocidadMaxima = vehiculo.getVelocidadMaxima();
        this.referencia = vehiculo.getReferencia();
    }

    @Override
    public String toString() {
        return  " model.Color:" + color +
                " Referencia:" + referencia +
                " Velocidad Máxima:" + velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
