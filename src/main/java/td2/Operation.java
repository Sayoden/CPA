package td2;

public abstract class Operation extends ExpressionArithmetique{

    private ExpressionArithmetique op1;

    private ExpressionArithmetique op2;

    private char ope;

    public Operation(ExpressionArithmetique op1, ExpressionArithmetique op2, char ope) {
        this.op1 = op1;
        this.op2 = op2;
        this.ope = ope;
    }

    @Override
    public double eval() {
        double ope1 = this.op1.eval();
        double ope2 = this.op2.eval();
        switch (this.ope) {
            case '+':
                return ope1 + ope2;
            case '*':
                return ope1 * ope2;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return this.op1 + " " + this.ope + " " + this.op2;
    }
}
