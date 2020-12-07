package Step8_Math1;

/**
 * https://www.acmicpc.net/problem/2839
 * 설탕 배달
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
 * 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 * 봉지는 3kg, 5kg 두 가지가 있다.
 */

import java.util.Scanner;

public class boj_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                           //상근이가 배달해야 하는 설탕의 무게
        int num = 0;                                    //봉지의 개수

        while (n > 0) {
            if (n % 5 == 0 && n % 3 == 0) {             //5와 3의 공배수인 경우
                n -= 5;
            } else if(n % 5 == 0) {                     //5의 배수인 경우
                n -= 5;
            } else if(n % 3 == 0) {                     //3의 배수인 경우
                n -= 3;
            } else {
                n -= 5;
            }
            num++;
        }

        if (n == 0)
            System.out.println(num);
        else
            System.out.println(-1);                     //정확하게 N kg을 맞출 수 없을 때
        sc.close();
    }
}
/**
 * 시간 초과
 */
//public class boj_2839 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();           //상근이가 배달해야 하는 설탕의 무게
//        int tmp = 0, num = -1;          //봉지의 개수
//
//        if (n % 5 == 0) {               //5kg 봉지만으로 N kg를 채울 수 있는 경우
//            num = n / 5;
//        } else {
//            tmp = n / 5;                //tmp = 5kg 봉지의 개수
//            while (tmp >= 0){
//                if (n - 5*tmp < 3 || n - 5*tmp == 4) {  //주어진 N kg에서 (5*tmp)kg을 뺀 값이 3보다 작거나 4인 경우 5kg 봉지의 개수를 줄임
//                    tmp--;
//                } else if((n - 5*tmp) % 3 == 0) {       //주어진 N kg에서 (5*tmp)kg을 뺀 값이 3으로 나누어 떨어지는 경우
//                    num = tmp + (n - 5*tmp)/3;          //5kg 봉지의 개수에 3kg 봉지의 개수를 더함
//                    break;
//                }
//            }
//        }
//
//        System.out.println(num);                        //정확하게 N kg을 맞출 수 없을 때 기본값인 -1 출력
//        sc.close();
//    }
//}