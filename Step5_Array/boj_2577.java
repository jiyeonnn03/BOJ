package Step5_Array;

/**
 * https://www.acmicpc.net/problem/2577
 * 숫자의 개수
 * 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면
 * A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */

import java.util.Scanner;

public class boj_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 100 || a >= 1000 || b < 100 || b >= 1000 || c < 100 || c >= 1000)
            return;

        int num = a * b * c;

        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int rest;

        while (true) {
            rest = num % 10;            //num을 10으로 나눈 나머지(맨 뒷자리 수)를 rest에 저장

            for (int i = 0; i < 10; i++) {
                if (rest == i)          //맨 뒷자리 수와 같은 값을 찾고
                    array[i] += 1;      //해당하는 배열의 값을 +1
            }

            //num / 10을 해서 위에서 계산한 맨 뒷자리값을 하나씩 제거
            num /= 10;

            //탈출 조건
            if (num == 0)
                break;
        }

        //array에 들어있는 값 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}