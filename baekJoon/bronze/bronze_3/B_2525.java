package baekJoon.bronze.bronze_3;

import java.util.Scanner;

public class B_2525 {
    public static void main(String[] args) {
       /* 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로
        빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b+c<60){
            if(a>=0 && a <= 23) {
                System.out.println(a + " "+ b+c);
            }else {
                System.out.println((a+1) + " "+ (b+c-60));
            }
        }else

        }

    }
}
