package Step8_Math1;

/**
 * https://www.acmicpc.net/problem/10250
 * ACM 호텔
 */

import java.util.Scanner;

public class boj_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();       //입력 수

        int h, w, n;
        int floor, roomNum;

        for (int i = 0; i < t; i++) {
            h = sc.nextInt();       //호텔의 층 수
            w = sc.nextInt();       //각 층의 방 수
            n = sc.nextInt();       //손님 도착 순서

            // 1 <= h, w <= 99
            if (h < 1 || w < 1 || h > 99 | w > 99)
                return;

            // 1 <= n <= h * w
            if (n < 1 || n > h * w)
                return;

            floor = n % h;          //도착 순서를 호텔의 전체 층 수로 나눈 나머지
            roomNum = (n / h) + 1;  //도착 순서를 호텔의 전체 층 수로 나눈 수 + 1

            //나머지가 0인 경우 == 가장 꼭대기 층 배정
            if (floor == 0) {
                floor = h;
                roomNum = n / h;
            }

            System.out.println(floor+""+String.format("%02d", roomNum));
        }

        sc.close();
    }
}