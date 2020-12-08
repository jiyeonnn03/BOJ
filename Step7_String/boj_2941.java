package Step7_String;

/**
 * https://www.acmicpc.net/problem/2941
 * 크로아티아 알파벳
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 * */

import java.util.Scanner;

public class boj_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = sc.next();

        // 입력 문자열은 최대 100글자
        if (str.length() > 100)
            return;

        // 입력 문자열은 알파벳 소문자, -, = 으로만 이루어져 있음
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 45 && str.charAt(i) != 61 && str.charAt(i) < 97 || str.charAt(i) > 122)
                return;
        }

        for(int i = 0; i < strArray.length; i++) {
            if (str.contains(strArray[i]))
                str = str.replaceAll(strArray[i], " "); //일치하는 크로아티아 알파벳을 공백으로 치환
        }

        //치환을 모두 마친 후 알파벳의 길이
        System.out.println(str.length());

        sc.close();
    }
}