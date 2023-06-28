package calculator;

public class LogCalculator implements Calculable{
    private Calculable calculable;
    Logger logger;
    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Calculable primary complex number : " + calculable.getResultReal()+"+"
                +calculable.getResultImaginary()+"i");
    }

    @Override
    public Calculable sum(double realPart2, double imaginaryPart2) {
        logger.writeLog("Sum with second complex number: " + realPart2+"+"+ imaginaryPart2+"i");
        return calculable.sum(realPart2,imaginaryPart2);
    }

    @Override
    public Calculable multi(double realPart2, double imaginaryPart2) {
        logger.writeLog("Multi with second complex number: " + realPart2+"+"+ imaginaryPart2+"i");
        return calculable.multi(realPart2,imaginaryPart2);
    }

    @Override
    public double getResultReal() {
        double result1 = calculable.getResultReal();
        logger.writeLog("Result: " + result1);
        return result1;
    }

    @Override
    public double getResultImaginary() {
        double result2 = calculable.getResultImaginary();
        logger.writeLog("Result: " + result2);
        return result2;
    }
}
