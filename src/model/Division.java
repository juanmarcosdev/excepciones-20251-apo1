package model;

public class Division extends OperacionMatematica {
    private double divisor;

    public Division(double dividendo, double divisor) {
        super(dividendo);
        this.divisor = divisor;
    }

    @Override
    public double calcular() throws ExcepcionOperacionInvalida {
        if (divisor == 0) {
            throw new ExcepcionOperacionInvalida("No se puede dividir por cero.");
        }
        return valor / divisor;
    }
}