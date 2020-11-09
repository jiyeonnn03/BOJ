package Step11_Bruteforce;

import java.util.Scanner;

/**
 * 블랙잭
 * N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
 * https://www.acmicpc.net/problem/2798
 */
public class boj_1798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //카드 개수
        int M = sc.nextInt();   //합의 최대값

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();    //배열에 저장
        }
        System.out.println(search(array, M));
    }

    public static int search(int[] array, int M) {
    int max = 0, sum = 0;

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            for (int z = 0; z < array.length; z++) {
                if (i == j || j == z || z == i) {
                    break;
                } else {
                    sum = array[i] + array[j] + array[z];
                    if (max < sum && sum <= M)
                        max = sum;
                }
            }
        }
    }
        return max;
    }
}