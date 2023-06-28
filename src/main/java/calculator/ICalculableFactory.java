package calculator;

public interface ICalculableFactory {
    Calculable create(double realPart, double imaginaryPart);
}
