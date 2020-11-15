package Step3_for;

/**
 * https://www.acmicpc.net/problem/10871
 * X보다 작은 수
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //입력값 개수
        int x = sc.nextInt();       //수식의 기준이 되는 값
        int[] array = new int[n];                    //입력값
        String num;

        // 1 <= n, x <= 10000
        if (n < 1 || x < 1 || n > 10000 || x > 10000)
            return;

        num = sc.next();

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(num.split(" ")[i]);

            if (array[i] < x)
                System.out.print(array[i] + " ");
        }

        sc.close();
    }
}

//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다고 했으므로,
//아래와 같이 nextInt로 값을 받는 것보다는 배열을 사용하는 게 좋을 것 같다.
//public class boj_10871 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();       //입력값 개수
//        int x = sc.nextInt();       //수식의 기준이 되는 값
//        int num;                    //입력값
//
//        // 1 <= n, x <= 10000
//        if (n < 1 || x < 1 || n > 10000 || x > 10000)
//            return;
//
//
//        for (int i = 0; i < n; i++) {
//            num = sc.nextInt();
//
//            if (num < x)
//                System.out.print(num + " ");
//        }
//        sc.close();
//    }
//}