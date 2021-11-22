package test;

public class Minus extends BinaryExpression{
    Minus(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public double calculate() {
        return this.left.calculate() - this.right.calculate();
    }
}
