package baekJoon.bronze.bronze4;

import java.util.Scanner;
//입력은 총 4줄이며, 한 줄에 하나씩 양의 정수가 적혀있다.
//
//첫 번째 줄에 집에서 학교까지의 이동 시간을 나타내는 초가 주어진다.
//두 번째 줄에 학교에서 PC방까지의 이동 시간을 나타내는 초가 주어진다.
//세 번째 줄에 PC방에서 학원까지의 이동 시간을 나타내는 초가 주어진다.
//마지막 줄에 학원에서 집까지의 이동 시간을 나타내는 초가 주어진다.
//집에 늦게 가면 혼나기 때문에, 총 이동시간은 항상 1 분 0 초 이상 59 분 59 초 이하이다.
public class B_5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int total;
        total = a+b+c+d;
        System.out.println(total/60);
        System.out.println(total%60);

    }
}
