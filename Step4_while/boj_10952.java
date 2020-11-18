package Step4_while;

/**
 * https://www.acmicpc.net/problem/10952
 * A+B - 5
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();

            // 0 < a, b < 10
            if (a <= 0 || b <= 0 || a >= 10 || b >= 10)
                return;

            //탈출 조건
            if (a == 0 && b == 0)
                break;

            System.out.println(a + b);
        }
        sc.close();
    }
}