package Step5_Array;

/**
 * https://www.acmicpc.net/problem/10818
 * 최소, 최대
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = -1000000, min = 1000000;

        // 1<= n <= 1,000,000
        if (n < 1 || n > 1000000)
            return;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

            if(array[i] < -1000000 || array[i] > 1000000)
                return;

            //입력한 수가 max보다 클 경우 입력값을 max에 대입
            if (max < array[i])
                max = array[i];

            //입력한 수가 min보다 작을 경우 입력값을 min에 대입
            if (min > array[i])
                min = array[i];
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}
