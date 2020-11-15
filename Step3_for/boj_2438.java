package Step3_for;

/**
 * https://www.acmicpc.net/problem/2438
 * 별 찍기 - 1
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * *
 * **
 * ***
 * ****
 * *****
 */

import java.util.Scanner;

public class boj_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1 <= n <= 100
        if(n < 1 || n > 100)
            return;

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}