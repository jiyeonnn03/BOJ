package Step7_String;

/**
 * https://www.acmicpc.net/problem/10809
 * 알파벳 찾기
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을
 * 출력하는 프로그램을 작성하시오.
 * */

import java.util.Scanner;

public class boj_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        //s의 길이는 100을 넘지 않음
        if (s.length() > 100)
            return;

        //s는 소문자로만 이루어진 단어
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 97 || s.charAt(i) > 122)
                return;
        }

        //소문자 a부터 z까지 탐색
        for (int j = 97; j < 123; j++) {
            //indexOf() : 해당 문자가 처음으로 등장하는 인덱스 반환
            System.out.print(s.indexOf(j) + " ");
        }

        sc.close();
    }
}