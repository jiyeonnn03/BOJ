package Step8_Math1;

/**
 * https://www.acmicpc.net/problem/1712
 * 손익분기점
 */

import java.util.Scanner;

public class boj_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();       //고정 비용(임대료, 재산세, 보험료, 급여..)
        int b = sc.nextInt();       //가변 비용(재료비, 인건비 ..)
        int c = sc.nextInt();       //판매 가격

        // 0 < a, b, c <= 21억
        if (a < 1 ||  b < 1 || c < 1 || a > 2100000000 || b > 2100000000 || c > 2100000000)
            return;

        //손익분기점 : 고정 비용 / (판매 가격 - 가변 비용)
        if ((c - b) > 0)
            System.out.println(((a / (c-b)) + 1));
        else
            System.out.println(-1);

        sc.close();
    }
}