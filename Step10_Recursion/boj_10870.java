package Step10_Recursion;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10870
 * 피보나치 수 5
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 */

public class boj_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));

        sc.close();
    }

    public static int fibo(int n) {
        if (n <= 1)
            return n;
        else
            return fibo(n-2) + fibo(n-1);
    }
}