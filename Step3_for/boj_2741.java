package Step3_for;

/**
 * https://www.acmicpc.net/problem/2741
 * N 찍기
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1 <= n <= 100000
        if (n < 1 || n > 100000)
            return;

        for(int i = 0; i < n; i++)
            System.out.println(i+1);

        sc.close();
    }
}