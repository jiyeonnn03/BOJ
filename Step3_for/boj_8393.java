package Step3_for;

/**
 * https://www.acmicpc.net/problem/8393
 * 합
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // 1 <= n <= 10000
        if (n < 0 || n > 10000)
            return;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println(sum);

        sc.close();
    }
}