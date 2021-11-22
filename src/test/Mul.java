package test;

public class Mul extends BinaryExpression{
    Mul(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public double calculate() {
        return this.left.calculate() * this.right.calculate();
    }
}
