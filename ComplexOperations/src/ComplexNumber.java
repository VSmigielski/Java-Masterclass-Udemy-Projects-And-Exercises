public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber other) {
        real += other.getReal();
        imaginary += other.getImaginary();
    }

    public void add(double r, double i) {
        real += r;
        imaginary += i;
    }

    public void subtract(ComplexNumber other) {
        real -= other.getReal();
        imaginary -= other.getImaginary();
    }

    public void subtract(double r, double i) {
        real -= r;
        imaginary -= i;
    }
}
