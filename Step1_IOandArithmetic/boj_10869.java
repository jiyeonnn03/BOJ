package Step1_IOandArithmetic;

/**
 * https://www.acmicpc.net/problem/10869
 * 사칙연산
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);    //덧셈
        System.out.println(a-b);    //뺄셈
        System.out.println(a*b);    //곱셈
        System.out.println(a/b);    //나눗셈(몫)
        System.out.println(a%b);    //나눗셈(나머지)
    }
}
