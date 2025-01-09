package com.example.calculator2;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> results = new ArrayList<>();
    private int firstNumber;
    private String type;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public String getType() {
        return type;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public ArrayList<Integer> getResults() {
        return new ArrayList<>(results);
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int calculate(int firstNumber, String type, int secondNumber) {
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

    public void removeResult() {
        results.remove(0);
    }
}
