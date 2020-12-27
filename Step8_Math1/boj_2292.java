package main;

/**
 * https://www.acmicpc.net/problem/2292
 * 벌집
 */

import java.util.Scanner;

public class boj_2292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1 <= n <= 1,000,000,000
        if (n < 1 || n > 1000000000)
            return;

        int count = 1;  // 지나는 방의 최소 개수
        int range = 2;	// 최솟값 기준 범위

        if (n == 1) {
            System.out.println(1);
        }

        else {
            while (range <= n) {    // 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * count);    // 다음 범위의 최솟값으로 초기화
                count++;    // count 1 증가
            }
            System.out.println(count);
        }

        sc.close();
    }
}