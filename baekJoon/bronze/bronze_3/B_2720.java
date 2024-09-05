package baekJoon.bronze.bronze_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer K = Integer.parseInt(bf.readLine());
        for (int i = 0; i < K; i++) {
            Integer a = Integer.parseInt(bf.readLine());
            int Q;
            int T;
            int N;
            int P;
            if (a % 25 == 0) {
                Q = a / 25;
                T = 0;
                N = 0;
                P = 0;
            } else {
                if ((a % 25) % 10 == 0) {
                    Q = a / 25;
                    T = (a % 25) / 10;
                    N = 0;
                    P = 0;
                } else {
                    if (((a % 25) % 10) % 5 == 0) {
                        Q = a / 25;
                        T = (a % 25) / 10;
                        N = ((a % 25) % 10) / 5;
                        P = 0;
                    } else {
                        Q = a / 25;
                        T = (a % 25) / 10;
                        N = ((a % 25) % 10) / 5;
                        P = ((a % 25) % 10) % 5;
                    }
                }
            }
            System.out.println(Q + " " + T + " " + N + " " + P);

        }
    }
}
