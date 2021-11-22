package test;

public class Plus extends BinaryExpression{
    Plus(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public double calculate() {
        return this.left.calculate() + this.right.calculate();
    }
}
