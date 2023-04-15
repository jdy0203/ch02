package practice;

import java.util.Scanner;

public class Ex_arr04 {
    //2562 문제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int max = arr[0]; //최댓값을 담을 변수
        int maxIndex = 0; //최댓값의 위치를 담는 변수

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}