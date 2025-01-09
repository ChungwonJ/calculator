package com.example.calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean finish = true;
        Calculator calculator = new Calculator();

        while (finish) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();

            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String type = sc.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();

            calculator.setFirstNumber(firstNumber);
            calculator.setType(type);
            calculator.setSecondNumber(secondNumber);

            int result = calculator.calculate(firstNumber, type, secondNumber);

            System.out.println("결과: " + result);

            sc.nextLine();
            System.out.print("exit를 입력하시면 종료됩니다: ");
            String termination = sc.nextLine();
            System.out.print("저장내용을 삭제하시겠습니까? y/n: ");
            String elimination = sc.nextLine();
            if (termination. equalsIgnoreCase("exit")) {
                if (elimination.equalsIgnoreCase("y")) {
                    calculator.removeResult();
                }
                System.out.println("종료되었습니다");
                System.out.println("현재 결과 리스트: " + calculator.getResults());
            }
        }
    }
}