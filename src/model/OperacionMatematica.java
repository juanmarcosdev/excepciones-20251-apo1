package model;

public abstract class OperacionMatematica {
    protected double valor;

    public OperacionMatematica(double valor) {
        this.valor = valor;
    }

    public abstract double calcular() throws ExcepcionOperacionInvalida;
}