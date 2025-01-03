package com.example.calculator1;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("사칙연산 기호를 입력하세요: ");
        String type = sc.nextLine();

        int result = 0;

        if(type.equals("+")){
            result = firstNumber + secondNumber;
        } else if (type.equals("-")){
            result = firstNumber - secondNumber;
        } else if (type.equals("*")){
            result = firstNumber * secondNumber;
        } else if (type.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("잘못되었습니다");
            return;
        }
        System.out.println("결과: " + result);
    }
}