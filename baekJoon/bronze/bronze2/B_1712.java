package baekJoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);
        int breakPoint;
        if (c-b<=0){
            System.out.println(-1);
        } else {
            System.out.println(breakPoint = a/(c-b)+1);
        }


    }
}
