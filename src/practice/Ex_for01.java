package practice;

import java.util.Scanner;

public class Ex_for01 {
    //2739 문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램 작성.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력하세요. > ");
        int input = scanner.nextInt();

        for(int j=1; j<=9; j++) {
            System.out.println(input + " * " + j + " = " + (input * j));
        }

        scanner.close();

    }
}
