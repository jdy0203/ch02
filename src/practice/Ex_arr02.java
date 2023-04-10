package practice;

import java.util.Scanner;

public class Ex_arr02 {
    //10871 문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}