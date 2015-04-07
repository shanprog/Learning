package ch_13.home.lst_17;

public class Complex implements Cloneable {

    private double a;
    private double b;

    public Complex(double real, double imaginary) {
        this.a = real;
        this.b = imaginary;
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex() {
        this(0, 0);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Complex(a, b);
    }

    @Override
    public String toString() {
        return "(" + a + " + " + b + "i)";
    }

    public Complex add(Complex c) {
        return new Complex(a + c.getRealPart(), b + c.getImaginaryPart());
    }

    public Complex subtract(Complex c) {
        return new Complex(a - c.getRealPart(), b - c.getImaginaryPart());
    }

    public Complex multiply(Complex c) {
        return new Complex(a * c.getRealPart() - b * c.getImaginaryPart(), b * c.getRealPart() + a * c.getImaginaryPart());
    }

    public Complex divide(Complex c) {
        return new Complex(
                (a * c.getRealPart() + b * c.getImaginaryPart()) / (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2)),
                (b * c.getRealPart() - a * c.getImaginaryPart()) / (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2))
        );
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
