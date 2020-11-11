package Step1_IOandArithmetic;

/**
 * https://www.acmicpc.net/problem/2588
 * 곱셈
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();       //472
        int b = sc.nextInt();       //385

        //괄호 주의!
        int n3 = a * (b%(b/10));    //b/10 = 38, b%(b/10) = b%38 = b를 38로 나눈 나머지 = 5
        int n4 = a * ((b/10)%10);     //b/10 = 38, (b/10)%10 = 38%10 = 38을 10으로 나눈 나머지 = 8
        int n5 = a * (b/100);         //b/100 = 385/100 = 3
        int n6 = n3 + n4*10 + n5*100; //a*b

        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
}
