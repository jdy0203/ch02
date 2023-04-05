package practice;

import java.util.Scanner;

public class Ex_arr01 {
    //10807 문제 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성
    public static void main(String[] args) {
        int count = 0; //입력받을 숫자의 개수
        int[] num; // 입력받을 숫자
        int result = 0;
        int resultSum = 0;

        Scanner sc = new Scanner(System.in);
        // 입력받을 숫자 개수 입력받기
        count = sc.nextInt();
        num = new int[count];

        //숫자 입력받기
        for(int i=0; i < count; i++){
            num[i] = sc.nextInt();
        }

        result = sc.nextInt();
        for(int i=0; i < count; i++){
            if(result == num[i]){
                resultSum++;
            }
        }
        System.out.println(resultSum);

    }
}
