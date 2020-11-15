package Step3_for;

/**
 * https://www.acmicpc.net/problem/11022
 * A+B - 8
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * "Case #x: A + B = C" 형식으로 출력 (x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.)
 */

import java.util.Scanner;

public class boj_11022 {
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

            //Case #x: A + B = C
            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
        }
        sc.close();
    }
}