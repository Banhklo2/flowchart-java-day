package day;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Day day = new Day(); // 객체 생성

        System.out.println("프로그램을 시작합니다!");

        while (true) {
            System.out.println("해당 번호를 입력하세요: ");

            if (!sc.hasNextInt()){
                System.out.println("잘못된 입력입니다!");
                sc.next();
                continue;
            }

            int num = sc.nextInt();

            if (num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (num < 0 || num > 7) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }
            if (day.printNum(num)) {
                break; // 정상 출력이면 종료
            }
        }
        sc.close();
    }
}
