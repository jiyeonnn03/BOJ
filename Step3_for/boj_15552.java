package Step3_for;

/**
 * https://www.acmicpc.net/problem/15552
 * 빠른 A+B
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
 * 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 * 또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다.
 * 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = 0, b = 0;
        int n = Integer.parseInt(br.readLine());    //첫 번째 라인에 있는 값을 n에 저장

        //n <= 1000000
        if (n > 1000000)
            return;

        for (int i = 0; i < n; i++) {               //n만큼 반복
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            // 1 <= a, b <= 1000
            if (a < 1 || b < 1 || a > 1000 | b > 1000)
                return;

            bw.write(a + b + "\n");
        }
        bw.flush(); //버퍼 비우기
        bw.close();
    }
}