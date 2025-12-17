package day;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Day day = new Day(); // 객체 생성

        System.out.println("프로그램을 시작합니다!");

        while (true) {
            System.out.println("해당 번호를 입력하세요: ");
            int num = sc.nextInt();

            if (num < 1 || num > 7){
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            day.printNum(num); // 정상 출력
            break; // 반복 종료
        }
        sc.close();
    }
}
