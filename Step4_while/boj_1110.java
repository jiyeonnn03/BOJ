package Step4_while;

/**
 * https://www.acmicpc.net/problem/1110
 * 더하기 사이클
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다.
 * 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다.
 * 따라서 26의 사이클의 길이는 4이다.
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class boj_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int newNum = -1;                //새로운 수(0으로 초기화 할 경우 입력값이 0이면 while문이 실행되지 않으므로 n의 범위 밖인 -1로 초기화)
        int n1 = 0, n2 = 0, sum = 0;
        int count = 0;                  //사이클 길이

        // 0 <= n <= 99
        if (n < 0 || n > 99)
            return;

        while(newNum != n) {
            if (count == 0) {
                n1 = n / 10;            //10의 자리 수
                n2 = n - n1*10;         //1의 자리 수
            } else {
                n1 = newNum / 10;       //10의 자리 수
                n2 = newNum - n1*10;    //1의 자리 수
            }
            sum = n1 + n2;
            newNum = (n2%10)*10 + sum%10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}