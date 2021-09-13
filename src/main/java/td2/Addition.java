package td2;

public class Addition extends ExpressionArithmetique {

    private ExpressionArithmetique op1;

    private ExpressionArithmetique op2;

    public Addition(ExpressionArithmetique op1, ExpressionArithmetique op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public double eval() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
