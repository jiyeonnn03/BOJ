package Step2_if;

/**
 * https://www.acmicpc.net/problem/2753
 * 윤년
 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // 1 <= year <= 4000
        if (year <= 0 || year > 4000)
            return;

        //윤년(4의 배수이면서 100의 배수는 아닌, 또는 400의 배수인 해)
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);

        sc.close();
    }
}
