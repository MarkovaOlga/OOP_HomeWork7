package calculator;

public class Calculator implements Calculable {

    private double realPart;
    private double imaginaryPart;
    public Calculator(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public Calculable sum(double realPart2, double imaginaryPart2) {
        realPart +=realPart2;
        imaginaryPart +=imaginaryPart2;
        return this;
    }

    @Override
    public Calculable multi(double realPart2, double imaginaryPart2) {
        double tempReal=realPart;
        tempReal=(realPart*realPart2)-(imaginaryPart*imaginaryPart2);
        imaginaryPart=(realPart*imaginaryPart2)+(imaginaryPart*realPart2);
        realPart = tempReal;
        return this;
    }

    @Override
    public double getResultReal() {
        return realPart;
    }

    @Override
    public double getResultImaginary() {
        return imaginaryPart;
    }

}
