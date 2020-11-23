package Step5_Array;

/**
 * https://www.acmicpc.net/problem/4344
 * 평균은 넘겠지
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();           //테스트 케이스 수
        int sum = 0, count = 0;
        int[] score;
        double n, avg, per;

        for (int i = 0; i < c; i++) {
            n = sc.nextInt();           //학생 수
            score = new int[(int)n];
            sum = 0;    count = 0;

            // 1 <= n <= 1000
            if (n < 1 || n > 1000)
                return;

            for (int j = 0; j < n; j++) {
                score[j] = sc.nextInt();   //점수

                // 0 <= score <= 100
                if (score[j] < 0 || score[j] > 100)
                    return;

                sum += score[j];
            }

            avg = sum / n;              //평균

            //평균울 넘는 학생의 수
            for (int j = 0; j < n; j++) {
                if (score[j] > avg)
                    count++;
            }

            //평균을 넘는 학생의 비율
            per = count / n * 100;

            System.out.println(String.format("%.3f", per) + "%");
        }
        sc.close();
    }
}