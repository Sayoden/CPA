package td2;

public abstract class ExpressionArithmetique {

    public ExpressionArithmetique() {
        super();
    }

    public abstract double eval();

    public abstract String toString();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
