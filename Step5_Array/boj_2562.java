package Step5_Array;

/**
 * https://www.acmicpc.net/problem/2562
 * 최댓값
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */

import java.util.Scanner;

public class boj_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];
        int count = 0, index = 0, max = 0;

        //입력값 배열에 저장
        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();

            // 0 < n < 100
            if (array[i] <= 0 || array[i] >= 100)
                return;
        }

        //for each문 사용해 array에 있는 요소를 하나씩 value로 꺼내옴
        for (int value : array) {
            count++;                //count=0이므로 미리 ++

            if (max < value) {
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);

        sc.close();
    }
}

//결과는 같은데 채점하면 틀렸다고 나온다ㅜㅜ
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] array = new int[9];
//        int index = 0, max = 0;
//
//        for (int i = 0; i < 9; i++) {
//            array[i] = sc.nextInt();
//
//            // 0 < n < 100
//            if (array[i] <= 0 || array[i] >= 100)
//                return;
//
//            //max를 첫 번째 입력값으로 초기화
//            if (i == 0)
//                max = array[i];
//
//            if (max < array[i]) {
//                max = array[i];
//                index = i + 1;  //i가 0부터 시작이므로 +1을 해줌
//            }
//        }
//        System.out.println(max);
//        System.out.println(index);
//    }
//}