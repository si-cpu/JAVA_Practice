package baekJoon.bronze.bronze_4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String s = bf.readLine();
        String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣기
        String a;
        String name = array[0];
        int age = Integer.parseInt(array[1]);
        int weight = Integer.parseInt(array[2]);

        System.out.println(age);
        System.out.println(weight);
        if (age > 17 || weight >= 80) {
            System.out.println(name + " " + "junior");
        } else {
            System.out.println(name + " " + "senior");
        }

    }
}
