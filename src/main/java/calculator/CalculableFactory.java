package calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(double realPart, double imaginaryPart) {
        return new Calculator(realPart, imaginaryPart);
    }
}
