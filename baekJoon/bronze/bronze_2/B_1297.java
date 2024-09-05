package baekJoon.bronze.bronze_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer D = Integer.parseInt(bf.readLine());
        Integer H = Integer.parseInt(bf.readLine());
        Integer W = Integer.parseInt(bf.readLine());
        int real_h;
        int real_w;
        long x;
        x = (long) Math.sqrt((D * D) / (H * H + W * W));
        real_h = (int) (x * H);
        real_w = (int) (x * W);
        System.out.printf("%d %d", real_w, real_h);


    }
}
