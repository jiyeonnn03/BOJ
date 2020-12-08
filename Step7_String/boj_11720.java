package Step7_String;

/**
 * https://www.acmicpc.net/problem/11720
 * 숫자의 합
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * */

import java.util.Scanner;

//charAt() 사용
public class boj_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1 <= n <= 100
        if (n < 1 || n > 100)
            return;

        String str = sc.next();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += str.charAt(i) - '0'; //charAt은 아스키코드값을 반환하므로 '0' 또는 48을 빼야 함!
        }

        System.out.println(sum);

        sc.close();
    }
}

//BufferedReader(getBytes) 사용
//public class boj_11720 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        br.readLine();
//
//        int sum = 0;
//
//        //for each문 사용
//        for (byte num : br.readLine().getBytes()) { //getBytes()는 문자열을 byte 배열로 반환함
//            sum += (num - 48);
//        }
//
//        System.out.println(sum);
//
//        sc.close();
//    }
//}