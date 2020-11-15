package Step3_for;

/**
 * https://www.acmicpc.net/problem/2439
 * 별 찍기 - 2
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */

import java.util.Scanner;

public class boj_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1 <= n <= 100
        if(n < 1 || n > 100)
            return;

        for (int i = 1; i < n + 1; i++) {
            for (int j = n; j > 0; j--) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
