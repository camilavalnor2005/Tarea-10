public class Division {
    private double a;
    private double b;

    public double calculate(double a, double b) {
        this.a = a;
        this.b = b;
        if (this.b != 0) {
            return this.a / this.b;
        } else {
            throw new ArithmeticException("División por cero no permitida");
        }
    }
}
