package com.example.calculator3;

public class ArithmeticCalculator {
    public int calculate(int firstNumber, int secondNumber, OperatorType operatorType) {
        switch (operatorType) {
            case ADDITION:
                return firstNumber + secondNumber;
            case SUBTRACTION:
                return firstNumber - secondNumber;
            case MULTIPLICATION:
                return firstNumber * secondNumber;
            case DIVISION:
                if (secondNumber == 0) {
                    System.out.print("0으로 나눌 수 없습니다");
                    return 0;
                } else {
                    return firstNumber / secondNumber;
                }
        }
        System.out.print("잘못된 연산입니다");
        return 0;
    }
}
