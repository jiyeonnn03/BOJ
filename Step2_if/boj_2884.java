package Step2_if;

/**
 * https://www.acmicpc.net/problem/2884
 * 알람시계
 * 현재 상근이가 설정한 알람 시각이 주어졌을 때,
 * 창영이의 방법(원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것)을 사용한다면,
 * 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        // 0 <= hour <= 23, 0 <= minute <= 59
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59)
            return;

        //분에서 45를 뺀 값이 0보다 작은 경우
        if (minute - 45 < 0) {
            if (hour == 0)      //'시'가 0인 경우 24-1한 값인 23으로 설정
                hour = 23;
            else                //그렇지 않은 경우 -1을 해줌
                hour -= 1;
            minute += 15;       //분 - 45 + 60 = 분 + 15
        } else {
            minute -= 45;       //'분'이 45보다 크거나 같은 경우 분 - 45
        }

        System.out.println(hour + " " + minute);

        sc.close();
    }
}