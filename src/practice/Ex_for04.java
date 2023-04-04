package practice;

import java.util.Scanner;

public class Ex_for04 {
    //25304 문제 : 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum = sum + (a*b);
        }

        if(total==sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();

    }
}
