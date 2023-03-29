package practice;

import java.util.Scanner;

public class Ex_for03 {
    //8393 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램 작성
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        sc.close();

    }
}
