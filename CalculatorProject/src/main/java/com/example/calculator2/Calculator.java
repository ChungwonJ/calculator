package com.example.calculator2;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> results = new ArrayList<>();
    private int firstNumber;
    private String type;
    private int secondNumber;

    public int calculate(int firstNumber, String type, int secondNumber) {
        this.firstNumber = firstNumber;
        this.type = type;
        this.secondNumber = secondNumber;
        int result = 0;

        if (type.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (type.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (type.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (type.equals("/")) {
            if (secondNumber == 0) {
                System.out.print("0으로 나눌 수 없습니다");
                return 0;
            } else {
                result = firstNumber / secondNumber;
            }
        } else {
            System.out.print("잘못된 연산입니다");
            return 0;
        }

        results.add(result);
        return result;
    }
    public int getFirstNumber() {
        return firstNumber;
    }

    public String getType() {
        return type;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void getFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void getType(String type) {
        this.type = type;
    }

    public void getSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void removeResult() {
        results.remove(0);
    }
}
