package Step5_Array;

/**
 * https://www.acmicpc.net/problem/8958
 * OX퀴즈
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int score = 0, sum = 0;

        int n = sc.nextInt();
        int[] array = new int[n];

        sc.nextLine();      //엔터값

        for (int i = 0; i < n; i++) {
            str = sc.nextLine();

            sum = 0;
            score = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'X')
                    score = 0;
                else
                    score++;

                sum += score;
            }
            array[i] = sum;

            System.out.println(array[i]);
        }
        sc.close();
    }
}

//런타임 에러
//public class boj_8958 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int score = 0, sum = 0;
//
//        int n = sc.nextInt();
//        String[] array = new String[80];
//
//        for (int i = 0; i < n; i++) {
//            array[i] = sc.next();
//
//            //0으로 초기화
//            sum = 0;
//            score = 0;
//
//            //입력한 문자의 길이만큼 반복하며 j번째 문자가 X일 때 0점으로 초기화
//            for (int j = 0; j < array[i].length(); j++) {
//                if (array[i].charAt(j) == 'X')
//                    score = 0;
//                else
//                    sum += ++score;
//            }
//
//            System.out.println(sum);
//        }
//    }
//}