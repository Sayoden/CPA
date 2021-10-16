package td2;

public class Constante extends ExpressionArithmetique {
    private double c;

    public Constante(double c) {
        this.c = c;
    }

    @Override
    public double eval() {
        return this.c;
    }

    @Override
    public String toString() {
        return Double.toString(this.c);
    }
}
