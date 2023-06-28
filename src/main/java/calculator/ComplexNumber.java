package calculator;

public class ComplexNumber {
    double realPart;
    double imaginaryPart;
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    @Override
    public String toString() {
        return String.format("%f + %fi", realPart, imaginaryPart);
    }
}
