package calculator;

public interface Calculable {
    Calculable sum(double realPart, double imaginaryPart);
    Calculable multi(double realPart, double imaginaryPart);
    double getResultReal();
    double getResultImaginary();
}
