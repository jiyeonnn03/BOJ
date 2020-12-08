package Step7_String;

/**
 * https://www.acmicpc.net/problem/11654
 * 아스키 코드
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.charAt(0);

        //입력값은 소문자, 대문자, 숫자 0-9 중 하나
        if(n < 48 || (n > 57 && n < 65) || (n > 90 && n < 97) || n > 122)
            return;

        System.out.println(n);

        sc.close();
    }
}
