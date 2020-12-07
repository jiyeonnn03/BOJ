package Step8_Math1;

/**
 * https://www.acmicpc.net/problem/2869
 * 달팽이는 올라가고 싶다
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double v = sc.nextInt();

        int period = 0;         //정상까지 올라가는데 걸리는 기간

        if (v == a)
            period = 1;
        else
            //an = a + (n - 1) * d와 같음
            period = (int) (Math.ceil((v-a)/(a-b))+1);

        System.out.println(period);

        sc.close();
    }
}


//시간 초과(제한 시간 0.15초)
//public class boj_2869 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int v = sc.nextInt();
//
//        int height = 0;         //올라간 높이
//        int period = 0;         //정상까지 올라가는데 걸리는 기간
//
//        while(true) {
//            height += a;        //a만큼 올라간 높이
//            period++;
//
//            //올라간 높이가 나무 막대의 높이보다 크거나 같은 경우
//            if (height >= v)
//                break;
//            else
//                height -= b;    //b만큼 미끄러진 높이
//        }
//
//        System.out.println(period);
//
//        sc.close();
//    }
//}