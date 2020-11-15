package Step2_if;

/**
 * https://www.acmicpc.net/problem/9498
 * 시험 성적
 * 시험 점수를 입력받아
 * 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        // 0 <= score <= 100
        if (score < 0 || score > 100)
            return;

        if (90 <= score && score <= 100)
            System.out.println("A");
        else if (80 <= score && score < 90)
            System.out.println("B");
        else if (70 <= score && score < 80)
            System.out.println("C");
        else if (60 <= score && score < 70)
            System.out.println("D");
        else
            System.out.println("F");

        sc.close();
    }
}
