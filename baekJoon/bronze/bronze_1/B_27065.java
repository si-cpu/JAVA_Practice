package baekJoon.bronze.bronze_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_27065 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> total = new ArrayList<Integer>();
        List<Integer> total1 = new ArrayList<Integer>();
        // 약수를 리스트에 담은 메서드
        for (int i = 1; i < a; i++) {
            if(a % i == 0) {
                total.add(i);
            }
        }
        System.out.println(total);


        // 판단 메서드
        int hap = 0;
        for (int i = 0; i < total.size()-1 ; i++) {
            total.get(i);
            for (int k = 1; k < a; k++) {
                if(a % k == 0) {
                    total1.add(k);
                }
            }
            for (int j = 0; j <= total.size() - 1; j++) {
                hap += (int) total1.get(i);
            }
        }



        System.out.println(hap);
        if(a >= hap){
            System.out.println("Good Bye");
        }else{
            System.out.println("BOJ 2022");
        }

        sc.close();
    }
}
