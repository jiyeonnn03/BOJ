package Step2_if;

/**
 * https://www.acmicpc.net/problem/1330
 * 두 수 비교하기
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // -10000 <= a, b <= 10000
        if (a < -10000 || a > 10000 || b < -10000 || b > 10000)
            return;

        if (a > b)
            System.out.println(">");
        else if (a < b)
            System.out.println("<");
        else if (a == b)
            System.out.println("==");

        sc.close();
    }
}
