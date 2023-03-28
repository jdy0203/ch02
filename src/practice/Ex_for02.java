package practice;

import java.util.Scanner;

public class Ex_for02 {
    //10950 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성
    //각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0<A, B<10)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testNum = scanner.nextInt();

        for(int i=1; i<=testNum; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();;
            System.out.println(A+B);
        }

        scanner.close();

    }
}
