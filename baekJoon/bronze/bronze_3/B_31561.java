package baekJoon.bronze.bronze_3;

import java.util.Scanner;

public class B_31561 {
//    근성은 공대 7호관 옆 카페에서 자바칩 프라푸치노를 주문하려다 문득 생각이 나 카페 직원에게 물어보았다.
//
//    c++칩 프라푸치노는 없나요?
//
//    근성의 황당한 질문을 들은 카페 직원은 화가 나서 근성을 바로 앞에 있는 시계탑 분침에 묶어버렸다.
//
//    그러자 시계탑의 분침이 근성의 무게로 인해 이상하게 돌아가기 시작했다. 분침은 정확히 다음 순서를 매시간 반복한다.
//
//    매시간 정각에 분침은 12시 방향을 가리킨다.
//    매시간 정각부터 15분까지 분침은 시계 방향으로 정상적인 분침의 회전 속도의
//    $2$배로 움직인다. 즉,
//    $15$분 간 분침은 12시 방향에서 시계 방향으로 6시 방향까지 움직인다.
//            매시간 15분에 분침은 6시 방향을 가리킨다.
//            매시간 15분부터 다음 시간 정각까지 분침은 시계 방향으로 정상적인 분침의 회전 속도의
//
//    $\frac{2}{3}$배로 움직인다. 즉,
//    $45$분 간 분침은 6시 방향에서 시계 방향으로 12시 방향까지 움직인다.
//
//
//    정상적인 시계탑의 분침은 매시간 정각에 정확히 12시 방향을 가리키며,
//    $1$시간에 한 바퀴를 시계 방향으로 일정한 회전 속도로 움직인다.
//
//    바뀐 시계탑의 시침은 정상적인 시계탑과 똑같이 돌아가기 때문에 문제가 없었으나, 사람들은 지금이 몇 분인지 헷갈리기 시작했다.
//
//    바뀐 시계탑을 보고 올바른 시각을 구해 사람들에게 알려주자.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    if(a >=0 && a <= 30){
        System.out.println(a/2);
    } else if (a<=59) {
        System.out.println(15+(a-30)*3/2);
    }
}
}
