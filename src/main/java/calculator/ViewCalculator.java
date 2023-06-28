package calculator;

import java.util.Scanner;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double realPart = promptDouble("Введите действительную часть первого комплексного числа: ");
            double imaginaryPart = promptDouble("Введите коэффициэнт при мнимой части первого комплексного числа: ");
            Calculable calculator = calculableFactory.create(realPart, imaginaryPart);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    double realPart2 = promptDouble("Введите действительную часть второго комплексного числа: ");
                    double imaginaryPart2 = promptDouble("Введите коэффициэнт при мнимой части второго комплексного числа: ");
                    calculator.multi(realPart2, imaginaryPart2);
                    continue;
                }
                if (cmd.equals("+")) {
                    double realPart2 = promptDouble("Введите действительную часть второго комплексного числа: ");
                    double imaginaryPart2 = promptDouble("Введите коэффициэнт при мнимой части второго комплексного числа: ");
                    calculator.sum(realPart2, imaginaryPart2);
                    continue;
                }
                if (cmd.equals("=")) {
                    double result1 = calculator.getResultReal();
                    double result2 = calculator.getResultImaginary();
                    System.out.printf("Результат: "+ result1 +"+" + result2+"i\n");
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
