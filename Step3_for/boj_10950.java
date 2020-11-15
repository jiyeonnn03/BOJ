package Step3_for;

/**
 * https://www.acmicpc.net/problem/10950
 * A+B - 3
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            // 0 < a, b < 10
            if (a <= 0 || b <= 0 || a >= 10 || b >= 10)
                return;

            System.out.println(a + b);
        }

        sc.close();
    }
}