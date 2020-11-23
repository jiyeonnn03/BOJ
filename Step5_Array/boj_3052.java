package Step5_Array;

/**
 * https://www.acmicpc.net/problem/3052
 * 나머지
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count, result = 0;
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();

            // 0 <= n <= 1000
            if (n > 1000 || n < 0)
                return;

            //42로 나눈 나머지를 배열에 저장
            array[i] = n % 42;
        }

        for (int i = 0; i < 10; i++) {
            count = 0;

            for (int j = i+1; j < 10; j++) {
                //값 비교
                if (array[i] == array[j])
                    count++;
            }

            if (count == 0)
                result++;
        }

        System.out.println(result);

        sc.close();
    }
}